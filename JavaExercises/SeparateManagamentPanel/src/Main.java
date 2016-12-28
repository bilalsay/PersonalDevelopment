import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;
import table_classes.Admin;
import table_classes.Customer;

public class Main extends Application{
    public Stage mainStage;
    public static boolean loginMod = false;
    public static ArrayList<Admin> admins = new ArrayList<Admin>();
    public BorderPane mainLayout;
    private int stageMinWidth = 1000;
    private int stageMinHeight = 600;
    private boolean stageFulScreenMod = true;
    
    @Override
    public void start(Stage mainStage) {
        try {
        this.mainStage = mainStage;
        FXMLLoader mainLoader = new FXMLLoader();
        if (Main.loginMod != true) {      
            this.mainStage.setTitle("Managament Panel - Login");       
            
            mainLoader.setLocation(Main.class.getResource("view/login.fxml"));
            mainLayout = (BorderPane) mainLoader.load();
            LoginController mainController = mainLoader.getController();
            mainController.setMainApp(this);
            stageFulScreenMod = false;
            stageMinHeight = 400;
            stageMinWidth = 400;
        
        } else {
            this.mainStage.setTitle("Managament Panel - "+admins.get(0).getName());
       
            mainLoader.setLocation(Main.class.getResource("view/main.fxml"));
            mainLayout = (BorderPane) mainLoader.load();
            
            FXMLLoader announcmentLoader = new FXMLLoader();
            announcmentLoader.setLocation(Main.class.getResource("view/announcment.fxml"));
            AnchorPane announcmentView = (AnchorPane) announcmentLoader.load();
            mainLayout.setCenter(announcmentView);
            
            RootController mainController = mainLoader.getController();
            mainController.setMainApp(this);  
            stageFulScreenMod = true;
            stageMinHeight = 700;
            stageMinWidth = 600;
              
        }
        
        Scene scene = new Scene(mainLayout);
        scene.getStylesheets().add(getClass().getResource("view/main.css").toExternalForm());
        mainStage.setScene(scene);
        
        
        mainStage.setOnHidden(new EventHandler<WindowEvent>() {
          public void handle(WindowEvent we) {
              
              if (Main.loginMod == true) {
                  Main.loginMod = false;
                  Platform.exit();
                  
              } 
              
          }
        });
        mainStage.show();
        mainStage.setMaximized(stageFulScreenMod);
        mainStage.setMinWidth(stageMinWidth);
        mainStage.setMinHeight(stageMinHeight); 
        mainStage.setMaxHeight(800);
        mainStage.setResizable(true);
        mainStage.centerOnScreen();
            
       } catch(IOException e) {
        
       }     
    }
    
    public void searchCustomer() throws IOException {
            FXMLLoader customerLoader = new FXMLLoader();
            customerLoader.setLocation(Main.class.getResource("view/search_customer.fxml"));
            AnchorPane customerOverView = (AnchorPane) customerLoader.load();
            mainLayout.setCenter(customerOverView);
            CustomerController customerController = customerLoader.getController();
            customerController.setMainApp(this);
            customerController.setDefaultValueCombo();
    }
    
    public void showCustomerPage(ResultSet data) throws IOException {
            FXMLLoader customerLoader = new FXMLLoader();
            customerLoader.setLocation(Main.class.getResource("view/customer.fxml"));
            AnchorPane customerOverView = (AnchorPane) customerLoader.load();
            mainLayout.setCenter(customerOverView);
            CustomerController customerController = customerLoader.getController();
            customerController.setMainApp(this);
            customerController.overViewCustomer(data);
    
    }
    

    public boolean addCustomerPage() {
        try {
            // Load the fxml file and create a new stage for the popup dialog.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/add_customer.fxml"));
            AnchorPane page = (AnchorPane) loader.load();

            // Create the dialog Stage.
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Add Customer");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(mainStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);
            
            scene.getStylesheets().add(getClass().getResource("view/main.css").toExternalForm());  
            
            CustomerController customerController = loader.getController();
            customerController.setDialogStage(dialogStage);        

            dialogStage.showAndWait();
            dialogStage.setMinWidth(600);
            dialogStage.setMinHeight(200);
            return customerController.isOkClicked();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        
    }
    
    public boolean updateCustomerPage(Customer customer) {
        try {
            // Load the fxml file and create a new stage for the popup dialog.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/update_customer.fxml"));
            AnchorPane page = (AnchorPane) loader.load();

            // Create the dialog Stage.
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Edit Customer");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(mainStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);
            
            scene.getStylesheets().add(getClass().getResource("view/main.css").toExternalForm());  
            
            CustomerController customerController = loader.getController();
            customerController.setDialogStage(dialogStage);        
            
            customerController.setCustomer(customer);
            
            dialogStage.showAndWait();
            return customerController.isOkClicked();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public Stage getMainStage() {
        return mainStage;
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}