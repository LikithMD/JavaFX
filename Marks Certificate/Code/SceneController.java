package application;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
public class SceneController {
private Stage stage;
@FXML
private Button exit;
@FXML
private AnchorPane exitPane;
@FXML
private TextField input;
@FXML
private TextField name;
@FXML
private TextField regno;
@FXML
private TextField skl;
@FXML
private TextField branch;
@FXML
private TextField m1;
@FXML
private TextField m2;
@FXML
private TextField m3;
@FXML
private TextField m4;
@FXML
private TextField m5;
@FXML
private TextField m6;
@FXML
private TextField m7;
@FXML
private TextField g1;
@FXML
private TextField g2;
@FXML
private TextField g3;
@FXML
private TextField g4;
@FXML
private TextField g5;
@FXML
private TextField g6;
@FXML
private TextField g7;
@FXML
private TextField tot;
@FXML
private TextField avg;
@FXML
private TextField fgrade;
private String markquery = "SELECT * FROM Marks WHERE StudentID=?";
private String gradequery = "SELECT * FROM Grades WHERE StudentID=?";
private String detailquery = "SELECT * FROM Details WHERE StudentID=?";
public void Searchdata(ActionEvent event) throws SQLException,IOException
{
String Sid;
Sid=input.getText();
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/DA2","root","");
PreparedStatement marksStat = conn.prepareStatement(markquery);
PreparedStatement gradesStat = conn.prepareStatement(gradequery);
PreparedStatement detailStat = conn.prepareStatement(detailquery);
marksStat.setString(1,Sid);
gradesStat.setString(1,Sid);
detailStat.setString(1,Sid);
ResultSet markSet=marksStat.executeQuery();
ResultSet gradeSet = gradesStat.executeQuery();
ResultSet detailsSet = detailStat.executeQuery();
while(markSet.next())
{
int mark1 = markSet.getInt("sts2201");
int mark2 = markSet.getInt("cse1004");
int mark3 = markSet.getInt("cse2001");
int mark4 = markSet.getInt("cse2002");
int mark5 = markSet.getInt("cse2003");
int mark6 = markSet.getInt("cse3001");
int mark7 = markSet.getInt("cse3002");
double total = Math.floor(mark1+mark2+mark3+mark4+mark5+mark6+mark7);
double average = Math.floor(total/7);
m1.setText(String.valueOf(mark1));
m2.setText(String.valueOf(mark2));
m3.setText(String.valueOf(mark3));
m4.setText(String.valueOf(mark4));
m5.setText(String.valueOf(mark5));
m6.setText(String.valueOf(mark6));
m7.setText(String.valueOf(mark7));
tot.setText(String.valueOf(total));
avg.setText(String.valueOf(average));
}
while(gradeSet.next())
{
g1.setText(gradeSet.getString("sts2201"));
g2.setText(gradeSet.getString("cse1004"));
g3.setText(gradeSet.getString("cse2001"));
g4.setText(gradeSet.getString("cse2002"));
g5.setText(gradeSet.getString("cse2003"));
g6.setText(gradeSet.getString("cse3001"));
g7.setText(gradeSet.getString("cse3002"));
fgrade.setText(gradeSet.getString("final"));
}
while(detailsSet.next()) {
name.setText(detailsSet.getString("Name"));
regno.setText(detailsSet.getString("StudentID"));
skl.setText(detailsSet.getString("School"));
branch.setText(detailsSet.getString("Branch"));
}
}
public void logout(ActionEvent event) throws SQLException
{
stage=(Stage)exitPane.getScene().getWindow();
stage.close();
}
}
