import static com.sun.javafx.util.Utils.split;
import java.io.IOException;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import table_classes.Customer;

public class CustomerController {  
    protected Main mainApp;  
    
    @FXML
    private Label updateTitle;
    
    @FXML 
    private TableColumn<Customer, String> customerId;
    
    @FXML 
    private TableColumn<Customer, String> nameSurname;
    
    @FXML 
    private TableColumn<Customer, String> password;
    
    @FXML 
    private TableColumn<Customer, String> email;
    
    @FXML 
    private TableColumn<Customer, String> phone;
    
    @FXML 
    private TableColumn<Customer, String> memberShipCode;
    
    @FXML 
    private TableColumn<Customer, String> memberShipMod;
    
    @FXML 
    private TableColumn<Customer, String> customerMod;    
      
    @FXML 
    private TableView<Customer> customerTable; 
    
    @FXML 
    private TextField customerName, customerSurname, customerEmail, customerPhone, updatingId;
    
    @FXML
    private PasswordField customerPassword;
       
    @FXML
    private Label message;
    
    @FXML
    private ComboBox<String> memberShipModCombo;
    
    @FXML
    private ComboBox<String> customerModCombo;
    
    private boolean okClicked;
    private Stage dialogStage;
    
    @FXML
    private void searchCustomerPage() throws IOException {
        mainApp.searchCustomer();        
    }
    
    public void setDefaultValueCombo(){
        memberShipModCombo.valueProperty().set("NULL");
        customerModCombo.valueProperty().set("NULL");
        
    }
    
    @FXML
    private void searchCustomer() throws IOException {
        MysqlConnection connection = new MysqlConnection();
        
       String sql = "SELECT *  FROM customer ";
       
       if (!"NULL".equals(memberShipModCombo.getValue()) && !"NULL".equals(customerModCombo.getValue())){
           sql += "WHERE membership_mod = "+("Onaysız".equals(memberShipModCombo.getValue()) ? 0 : 1);
           sql += " && customer_mod = "+("Onaysız".equals(customerModCombo.getValue()) ? 0 : 1);
       } else if("NULL".equals(memberShipModCombo.getValue()) && !"NULL".equals(customerModCombo.getValue())) {
           sql += "WHERE customer_mod = "+("Onaysız".equals(customerModCombo.getValue()) ? 0 : 1);
       } else if(!"NULL".equals(memberShipModCombo.getValue()) && "NULL".equals(customerModCombo.getValue())){
           sql += "WHERE membership_mod = "+("Onaysız".equals(memberShipModCombo.getValue()) ? 0 : 1);
       }    
       
       ResultSet data = connection.exect(connection.state(), sql);       
       
       customerTable.scrollTo(50);
       customerTable.getItems().clear();
        try {
        while(data.next()) {
            customerTable.getItems().add(new Customer(
                    String.valueOf(data.getInt("customer_id")),
                    data.getString("name_surname"),
                    data.getString("password"),
                    data.getString("email"), 
                    data.getString("phone"), 
                    data.getString("membership_code"),
                    data.getInt("membership_mod") == 0 ? "Onaysız" : "Onaylı",
                    data.getInt("customer_mod") == 0 ? "Onaysız" : "Onaylı"
            ));
            
            customerId.setCellValueFactory(cellData -> { return new ReadOnlyStringWrapper(cellData.getValue().customerId); });
            nameSurname.setCellValueFactory(cellData -> { return new ReadOnlyStringWrapper(cellData.getValue().nameSurname); });
            password.setCellValueFactory(cellData -> { return new ReadOnlyStringWrapper(cellData.getValue().password); });
            email.setCellValueFactory(cellData -> { return new ReadOnlyStringWrapper(cellData.getValue().email); });
            phone.setCellValueFactory(cellData -> { return new ReadOnlyStringWrapper(cellData.getValue().phone); });
            memberShipCode.setCellValueFactory(cellData -> { return new ReadOnlyStringWrapper(cellData.getValue().memberShipCode); });
            memberShipMod.setCellValueFactory(cellData -> { return new ReadOnlyStringWrapper(cellData.getValue().memberShipMod); });
            customerMod.setCellValueFactory(cellData -> { return new ReadOnlyStringWrapper(cellData.getValue().customerMod); });
        }
           
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }
    
    @FXML
    private void deleteCustomer() throws SQLException {
        int selectedIndex = customerTable.getSelectionModel().getSelectedIndex();
        int id = Integer.parseInt(customerTable.getSelectionModel().getSelectedItem().customerId);
        if (selectedIndex >= 0) {
            customerTable.getItems().remove(selectedIndex);
            MysqlConnection connection = new MysqlConnection();
            Connection conn = connection.getConnection();
            String query = "DELETE FROM customer WHERE customer_id = ?";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setInt(1, id);
            int rowsInserted = preparedStmt.executeUpdate();
            if (rowsInserted > 0) {
                preparedStmt.close();
            }                 
            
        } else {
            // Nothing selected.
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.initOwner(mainApp.getMainStage());
            alert.setTitle("No Selection");
            alert.setHeaderText("No Customer Selected");
            alert.setContentText("Please select a customer in the table.");            
            alert.showAndWait();
        }
    }
    
    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }    
   
   public void overViewCustomer(ResultSet data) {
       customerTable.scrollTo(50);
        try {
        while(data.next()) {
            customerTable.getItems().add(new Customer(
                    String.valueOf(data.getInt("customer_id")),
                    data.getString("name_surname"),
                    data.getString("password"),
                    data.getString("email"), 
                    data.getString("phone"), 
                    data.getString("membership_code"),
                    data.getInt("membership_mod") == 0 ? "Onaysız" : "Onaylı",
                    data.getInt("customer_mod") == 0 ? "Onaysız" : "Onaylı"
            ));
            
            customerId.setCellValueFactory(cellData -> { return new ReadOnlyStringWrapper(cellData.getValue().customerId); });
            nameSurname.setCellValueFactory(cellData -> { return new ReadOnlyStringWrapper(cellData.getValue().nameSurname); });
            password.setCellValueFactory(cellData -> { return new ReadOnlyStringWrapper(cellData.getValue().password); });
            email.setCellValueFactory(cellData -> { return new ReadOnlyStringWrapper(cellData.getValue().email); });
            phone.setCellValueFactory(cellData -> { return new ReadOnlyStringWrapper(cellData.getValue().phone); });
            memberShipCode.setCellValueFactory(cellData -> { return new ReadOnlyStringWrapper(cellData.getValue().memberShipCode); });
            memberShipMod.setCellValueFactory(cellData -> { return new ReadOnlyStringWrapper(cellData.getValue().memberShipMod); });
            customerMod.setCellValueFactory(cellData -> { return new ReadOnlyStringWrapper(cellData.getValue().customerMod); });
        }
           
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
   }
   
   @FXML
   private void addCustomerPage() throws IOException {
           mainApp.addCustomerPage();
   }
   
   @FXML
   private void updateCustomerPage() throws IOException {
       Customer selectedCustomer = customerTable.getSelectionModel().getSelectedItem();       
       mainApp.updateCustomerPage(selectedCustomer);
   }
   
   @FXML
    private void addCustomer(){ 
        String addedName = customerName.getText().trim();
        String addedSurname = customerSurname.getText().trim();
        String addedPassword = customerPassword.getText().trim();
        String addedEmail = customerEmail.getText().trim();
        String addedPhone = customerPhone.getText().trim();
        
        if (addedName.isEmpty() || addedSurname.isEmpty() || addedPassword.isEmpty() || addedEmail.isEmpty() || addedPhone.isEmpty()) {            
            message.setId("message_error");
            message.setText("Lütfen Bilgileri boş bırakmayın");
            message.setVisible(true);
        } else {
            if (addedPassword.matches("^[1-9]\\d*$") || addedPassword.matches("[a-zA-Z]+\\.?") || addedPassword.split("").length < 8) {
                message.setId("message_error");
                message.setText("Password değeri sadece sayıdan ve \nsadece harften  oluşamaz ve enaz 8 \nkarakter olmalı");
                message.setVisible(true);
            } else {
                    if (addedPhone.matches("[a-zA-Z]+\\.?") || addedPhone.split("").length > 11 || addedPhone.split("").length < 11) {
                message.setId("message_error");
                message.setText("Telefon numarası rakam içermeli \nve 11 hane olmalı");
                message.setVisible(true);
            } else {
            try { 
            MessageDigest md = MessageDigest.getInstance("SHA-256"); 
            md.update(addedPassword.getBytes("UTF-8"));
            byte[] digest = md.digest();
            addedPassword = String.format("%064x", new java.math.BigInteger(1, digest));
             
        MysqlConnection connection = new MysqlConnection();
        Connection conn = connection.getConnection();
        String insert_sql = "INSERT INTO customer(name_surname, email, password, phone, membership_mod, customer_mod) VALUES(?,?,?,?,?,?)";
        
        PreparedStatement statement = conn.prepareStatement(insert_sql);
                            statement.setString(1, addedName + " "+addedSurname);
                            statement.setString(2, addedEmail);
                            statement.setString(3, addedPassword);
                            statement.setString(4, addedPhone);
                            statement.setInt(5, 0);
                            statement.setInt(6, 0);

                            int rowsInserted = statement.executeUpdate();
                            if (rowsInserted > 0) {
                                
                                statement.close();
                            } 
    }catch (Exception e) {
            System.out.println(e.getMessage());
       }
        okClicked = true;
        dialogStage.close();
            }
    }
        }
    }        
    
    public void setCustomer(Customer customer) {
        updateTitle.setText(customer.nameSurname);
        String[] splitNameSurname = split(customer.nameSurname, " ");
        updatingId.setText(customer.customerId);
        customerName.setText(splitNameSurname[0]);
        customerSurname.setText(splitNameSurname[1]);
        customerPassword.setText(customer.password);
        customerEmail.setText(customer.email);
        customerPhone.setText(customer.phone);
        memberShipModCombo.valueProperty().set(customer.memberShipMod);
        customerModCombo.valueProperty().set(customer.customerMod);
    }
    
    @FXML
    private void updateCustomer(){   
        String updatedName = customerName.getText().trim();
        String updatedSurname = customerSurname.getText().trim();
        String updatedPassword = customerPassword.getText().trim();
        String updatedEmail = customerEmail.getText().trim();
        String updatedPhone = customerPhone.getText().trim();
        
        if (updatedName.isEmpty() || updatedSurname.isEmpty() || updatedPassword.isEmpty() || updatedEmail.isEmpty() || updatedPhone.isEmpty()) {            
            message.setId("message_error");
            message.setText("Lütfen Bilgileri boş bırakmayın");
            message.setVisible(true);
        } else {
            if (updatedPassword.matches("^[1-9]\\d*$") || updatedPassword.matches("[a-zA-Z]+\\.?") || updatedPassword.split("").length < 8) {
                message.setId("message_error");
                message.setText("Password değeri sadece sayıdan ve \nsadece harften  oluşamaz ve enaz 8 \nkarakter olmalı");
                message.setVisible(true);
            } else {
                    if (updatedPhone.matches("[a-zA-Z]+\\.?") || updatedPhone.split("").length > 11 || updatedPhone.split("").length < 11) {
                message.setId("message_error");
                message.setText("Telefon numarası rakam içermeli \nve 11 hane olmalı");
                message.setVisible(true);
            } else {        
        try {
        MessageDigest md = MessageDigest.getInstance("SHA-256"); 
            md.update(updatedPassword.getBytes("UTF-8"));
            byte[] digest = md.digest();
            updatedPassword = String.format("%064x", new java.math.BigInteger(1, digest));
             
        MysqlConnection connection = new MysqlConnection();
        Connection conn = connection.getConnection();
        String insert_sql = "UPDATE customer SET name_surname = ?,  email = ?, password = ?, phone = ?, membership_mod = ?, customer_mod = ? WHERE customer_id = ?";
        
        PreparedStatement statement = conn.prepareStatement(insert_sql);
                            statement.setString(1, updatedName + " "+updatedSurname);
                            statement.setString(2, updatedEmail);
                            statement.setString(3, updatedPassword);
                            statement.setString(4, updatedPhone);
                            statement.setInt(5, ("Onaysız".equals(memberShipModCombo.getValue()) ? 0 : 1));
                            statement.setInt(6, ("Onaysız".equals(customerModCombo.getValue()) ? 0 : 1));
                            statement.setInt(7, Integer.parseInt(updatingId.getText()));

                            int rowsUpdated = statement.executeUpdate();
                            if (rowsUpdated > 0) {
                                
                                statement.close();
                            } 
    }catch (Exception e) {
            System.out.println(e.getMessage());
       }
        okClicked = true;
        dialogStage.close();
                    }
            }
        }
    }
   
    public boolean isOkClicked() {
        return okClicked;
    }
    
   
   public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }
    
}
