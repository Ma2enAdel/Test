package hellofx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;




public class GUI extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FirstMenu1.fxml"));
        Parent root = loader.load();
        

        
        Scene scene = new Scene(root,1280,750);
        
        primaryStage.setTitle("Hospital Mangement System");
        
        primaryStage.setScene(scene);
        
        primaryStage.show();

        Image icon = new Image("file:/C:/Users/mazen/Downloads/icon1.png");
        primaryStage.getIcons().add(icon);
    }

    public static void main(String[] args) {
        launch(args);
    }


    

       public void switchToSecondMenu(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(Main.class.getResource("SecondMenu.fxml")); // Load the second menu FXML
        Scene scene = new Scene(root, 1280, 750);
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    
    public void switchToThirdMenu(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(Main.class.getResource("RegisterMenu.fxml")); // Load the second menu FXML
        Scene scene = new Scene(root, 1280, 750);
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    

}
