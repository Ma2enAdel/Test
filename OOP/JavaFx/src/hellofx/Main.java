package hellofx;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

   public void start(Stage FirstMenu) throws IOException {
      
       Group root = FXMLLoader.load(getClass().getResource("FirstMenu.fxml"));
       Scene scene = new Scene(root);
        FirstMenu.setResizable(false);
        FirstMenu.setScene(scene);
        FirstMenu.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}