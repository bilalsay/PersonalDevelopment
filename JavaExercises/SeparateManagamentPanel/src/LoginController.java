import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import table_classes.Admin;

public class LoginController {
    protected Main mainApp;   
    
    @FXML 
    private TextField adminEmail;
    
    @FXML
    private PasswordField adminPassword;
       
    @FXML
    private Label message;
    
    @FXML
    private void loginSystem() {
        String email = adminEmail.getText().trim();
        String password = adminPassword.getText().trim();
        if (password.isEmpty() || email.isEmpty()) {            
            message.setId("message_error");
            message.setText("Lütfen Bilgileri boş bırakmayın");
            message.setVisible(true);
        } else {
            if (password.matches("^[1-9]\\d*$") || password.matches("[a-zA-Z]+\\.?") || password.split("").length < 8) {
                message.setId("message_error");
                message.setText("Password değeri sadece sayıdan ve \nsadece harften  oluşamaz ve enaz 8 \nkarakter olmalı");
                message.setVisible(true);
            } else {
                try {
                    MessageDigest md = MessageDigest.getInstance("SHA-256"); 
                    md.update(password.getBytes("UTF-8"));
                    byte[] digest = md.digest();
                    password = String.format("%064x", new java.math.BigInteger(1, digest));
                    MysqlConnection connection = new MysqlConnection();
                    String sql = "SELECT count(email),admin_id, name, email, degree  FROM admin WHERE email = '"+email+"' && password = '"+ password +"'";
                    ResultSet data = connection.exect(connection.state(), sql); 
                    data.next();
                    if (data.getInt(1) == 1) {                        
                        Main.admins.add(new Admin(data.getInt("admin_id"), data.getString("name"), data.getString("email"), data.getInt("degree")));
                        Main.loginMod = true;
                        mainApp.start(mainApp.mainStage);                        
                    } else {
                        message.setId("message_error");
                        message.setText("Bu bigilere sahib herhangi \nbir admin bulunmuyor");
                        message.setVisible(true);                        
                    }                     
               } catch (Exception e) {
                    System.out.println(e.getStackTrace());
               }
            }
        }
    }   
   
    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }
    
}
