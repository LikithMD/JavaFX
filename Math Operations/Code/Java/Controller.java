package application;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
public class Controller
{
private Stage stage;
private Scene scene;
private Parent root;
@FXML
private Button exit;
@FXML
private AnchorPane exitPane;
@FXML
private Label answer1;
@FXML
private TextField factorial;
@FXML
private Button submit1;
@FXML
private Label answer2;
@FXML
private TextField natural;
@FXML
private Button submit2;
@FXML
private Label answer3;
@FXML
private TextField posneg;
@FXML
private Button submit3;
@FXML
private Label answer4;
@FXML
private TextField evenodd;
@FXML
private Button submit4;
@FXML
private Label answer5;
@FXML
private TextField ascii;
@FXML
private Button submit5;
@FXML
private Label answer6;
@FXML
private TextField fibno;
@FXML
private Button submit6;
public void switchToScene1(ActionEvent event) throws IOException {
root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}
public void switchToScene2(ActionEvent event) throws IOException {
Parent root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}
public void switchToScene3(ActionEvent event) throws IOException {
Parent root = FXMLLoader.load(getClass().getResource("Scene3.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}
public void switchToScene4(ActionEvent event) throws IOException {
Parent root = FXMLLoader.load(getClass().getResource("Scene4.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}
public void switchToScene5(ActionEvent event) throws IOException {
Parent root = FXMLLoader.load(getClass().getResource("Scene5.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}
public void switchToScene6(ActionEvent event) throws IOException {
Parent root = FXMLLoader.load(getClass().getResource("Scene6.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}
public void switchToScene7(ActionEvent event) throws IOException {
Parent root = FXMLLoader.load(getClass().getResource("Scene7.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}
public void factorial_calculation(ActionEvent event) {
int fact = 1,num;
try {
num = Integer.parseInt(factorial.getText());
for(int i=1; i<=num; i++) {
fact = fact*i;
}
answer1.setText(String.valueOf(fact));
}
catch(NumberFormatException ex) {
answer1.setText("Enter only numbers");
}
catch(Exception ex) {
System.out.println(ex);
}
}
public void natural_numbers(ActionEvent event) {
int num;
double sum=0.0;
try {
num = Integer.parseInt(natural.getText());
sum=(num*(num+1))/2;
answer2.setText(String.valueOf(sum));
}
catch(NumberFormatException ex) {
answer2.setText("Enter only numbers");
}
catch(Exception ex) {
System.out.println(ex);
}
}
public void positive_negative(ActionEvent event) {
double num;
try {
num = Integer.parseInt(posneg.getText());
if(num<0)
answer3.setText("NEGATIVE NUMBER!!");
else if(num>0)
answer3.setText("POSITIVE NUMBER!!");
else
answer3.setText("NEITHER POSITIVE NOR NEGATIVE!!");
}
catch(NumberFormatException ex) {
answer3.setText("Enter only numbers");
}
catch(Exception ex) {
System.out.println(ex);
}
}
public void even_odd(ActionEvent event) {
double num;
try {
num = Integer.parseInt(evenodd.getText());
if(num%2==0)
answer4.setText("EVEN NUMBER!!");
else
answer4.setText("ODD NUMBER!!");
}
catch(NumberFormatException ex) {
answer4.setText("Enter only numbers");
}
catch(Exception ex) {
System.out.println(ex);
}
}
public void ascii_value(ActionEvent event) {
char ch;
try {
ch = ascii.getText().charAt(0);
int val=ch;
answer5.setText(String.valueOf(val));
}
catch(Exception ex) {
System.out.println(ex);
}
}
public void fibonacci_series(ActionEvent event) {
int num;
int n1=0,n2=1,n3;
String text="";
try {
num = Integer.parseInt(fibno.getText());
for(int i=1;i<=num;++i)
{
text+=String.valueOf(n1)+" ";
if(i%8==0)
{
text+="\n";
}
n3=n1+n2;
n1=n2;
n2=n3;
}
answer6.setText(text);
}
catch(NumberFormatException ex) {
answer6.setText("Enter only numbers");
}
catch(Exception ex) {
System.out.println(ex);
}
}
public void logout(ActionEvent event)
{
stage=(Stage) exitPane.getScene().getWindow();
stage.close();
}
}
