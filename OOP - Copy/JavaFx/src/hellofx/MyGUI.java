package hellofx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;



public class MyGUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage Stage) throws Exception{
        
        Group root = new Group();
        Scene scene = new Scene(root,Color.DARKRED);

        Stage.setScene(scene);
        Stage.show();

        Image icon = new Image("file:/C:/Users/mazen/Downloads/icon1.png");

        ImageView imageview = new ImageView("file:/C:/Users/mazen/Downloads/icon1.png");
        imageview.setX(230);
        imageview.setY(10);

        imageview.setScaleX(0.3);
        imageview.setScaleY(0.3);
    

        Stage.getIcons().add(icon);
        Stage.setTitle("Hospital Mangement System");

        Stage.setWidth(1000);
        Stage.setHeight(700);
        Stage.setResizable(false);

        Text text = new Text();
        text.setText("Hospital System");

        text.setX(200);
        text.setY(100);

        text.setFont(Font.font("Verdana",70));
        text.setFill(Color.WHITESMOKE);

        Line line = new Line();
        line.setStartX(200);
        line.setEndX(770);
        
        line.setStartY(110);
        line.setEndY(110);

        line.setStrokeWidth(5);
        line.setStroke(Color.WHITESMOKE);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(330);
        rectangle.setY(170);

        rectangle.setWidth(300);
        rectangle.setHeight(420);
        rectangle.setFill(Color.WHITESMOKE);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.BLACK);
        


        root.getChildren().add(line);
        root.getChildren().add(text);
        root.getChildren().add(rectangle);
        root.getChildren().add(imageview);

      
        


        
       
    }




   
}