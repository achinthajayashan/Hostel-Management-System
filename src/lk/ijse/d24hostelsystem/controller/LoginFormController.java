package lk.ijse.d24hostelsystem.controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.fxml.FXMLLoader.load;

public class LoginFormController {
    public JFXTextField txtUserName;
    public JFXPasswordField txtPassword;
    public JFXTextField txtShowPassword;
    public ImageView showIcon;
    public ImageView hideIcon;
    public AnchorPane pane;
    String password;

    public void initialize(){
        hideIcon.setVisible(false);
        txtShowPassword.setVisible(false);
    }

    public void loginOnAction(ActionEvent actionEvent) throws IOException {
//        Stage stage= new Stage();
//        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/lk/ijse/d24hostelsystem/view/Dashboard.fxml"))));
        if (txtUserName.getText().equals("achi")&& txtPassword.getText().equals("0215")){
            pane.getChildren().setAll((Node) load(getClass().getResource("/lk/ijse/d24hostelsystem/view/DashboardForm.fxml")));
        }else {
           new Alert(Alert.AlertType.ERROR,"username or password not matched !").show();
        }

    }

    public void hidePasswordonAction(KeyEvent keyEvent) {
        password=txtPassword.getText();
        txtShowPassword.setText(password);
    }

    public void showPasswordOnAction(KeyEvent keyEvent) {
        password=txtShowPassword.getText();
        txtPassword.setText(password);

    }

    public void showPasswordOncliked(MouseEvent mouseEvent) {
        showIcon.setVisible(false);
        txtPassword.setVisible(false);

        hideIcon.setVisible(true);
        txtShowPassword.setVisible(true);
    }

    public void hidePasswordOncliked(MouseEvent mouseEvent) {
        hideIcon.setVisible(false);
        txtShowPassword.setVisible(false);

        showIcon.setVisible(true);
        txtPassword.setVisible(true);
    }
}
