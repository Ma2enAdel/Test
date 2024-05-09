package hellofx;

import Hospital.Hospital;
import Hospital.LoginSys;
import Hospital.MainMenu;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import java.util.ArrayList;

import java.io.IOException;


    public class MyController {


    public static ArrayList<String> usernames = new ArrayList<>();
    public static ArrayList<String> passwords = new ArrayList<>();

    MainMenu m = new MainMenu();
    Hospital h = new Hospital();


    

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    private Stage primaryStage;

    private LoginSys loginSystem = new LoginSys();

    @FXML
    private void register() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        if(loginSystem.Register(username, password)){
            showAlert("Registration Successful!", "Welcome " + username);
        }
        else{
            showAlert("Registration failed", "Invalid Username or Password");
        
        }

        
    }
 

@FXML
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("SecondMenu.fxml"));
        primaryStage.setTitle("Login Menu");
        primaryStage.setScene(new Scene(root, 1280, 750));
        primaryStage.show();
 

        // Find the text fields and login button
        usernameField = (TextField) root.lookup("#usernameField");
        passwordField = (PasswordField) root.lookup("#passwordField");
        Button loginButton = (Button) root.lookup("#loginButton");

        // Set action for login button
        loginButton.setOnAction(event -> attemptLogin());
    }

    // Method to attempt login
    @FXML
    private void attemptLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();


        if (loginSystem.Login(username, password)) {
            // Successful login, show a message or navigate to another page
            showAlert("Login Successful", "Welcome " + username);
            do {
                m.LoginPrompt();
            } while (m.LoginMenu(h));

            // Here you can navigate to another page or perform any action needed after successful login
        } else {
            // Failed login, show an error message
            showAlert("Login Failed", "Invalid username or password");
        }
    }

    // Method to show an alert
    @FXML
    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    @FXML

    
    private void loadFirstMenu(ActionEvent press) throws IOException{
  

            Parent root = FXMLLoader.load(getClass().getResource("FirstMenu1.fxml"));
            
            Stage stage = (Stage) ((Node) press.getSource()).getScene().getWindow();
            stage.setTitle("Hospital Mangement System");

       
            stage.setScene(new Scene(root, 1280, 750));
            stage.show();
            primaryStage.close();

        
    

            Image icon = new Image("file:/C:/Users/mazen/Downloads/icon1.png");
            stage.getIcons().add(icon);
    }
}
    


