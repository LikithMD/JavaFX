package application;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
public class Main extends Application {
@Override
public void start(Stage stage) {
try {
Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
Scene scene = new Scene(root);
stage.setScene(scene);
Image icon=new Image("icon.png");
stage.getIcons().add(icon);
stage.setTitle("MATHS IS FUN!!");
stage.show();
} catch(Exception e) {
e.printStackTrace();
}
}
public static void main(String[] args) {
launch(args);
}
}
