package application;
import java.io.IOException;
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
Parent root = FXMLLoader.load(getClass().getResource("display.fxml"));
Scene login = new Scene(root);
stage.setScene(login);
Image icon=new Image("image.png");
stage.getIcons().add(icon);
stage.setTitle("STUDENT'S MARK MEMO");
stage.show();
} catch(Exception e) {
e.printStackTrace();
}
}
public static void main(String[] args) throws IOException
{
launch(args);
}
}
