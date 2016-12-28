import java.io.IOException;
import java.sql.ResultSet;
import javafx.fxml.FXML;

public class RootController {
    protected Main mainApp;   
   
    @FXML
    public void showCustomer() throws IOException {
       MysqlConnection connection = new MysqlConnection();
       String sql = "SELECT *  FROM customer";
       ResultSet data = connection.exect(connection.state(), sql);       
       mainApp.showCustomerPage(data);
    }
    
    @FXML
    private void logout() {
        Main.loginMod = false;
        mainApp.start(mainApp.mainStage);
    }
    
    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }
    
}
