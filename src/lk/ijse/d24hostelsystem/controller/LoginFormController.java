package lk.ijse.d24hostelsystem.controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class LoginFormController {
    public JFXTextField txtUserName;
    public JFXPasswordField txtPassword;
    public JFXTextField txtShowPassword;
    public ImageView showIcon;
    public ImageView hideIcon;
    String password;

    public void initialize(){
        hideIcon.setVisible(false);
        txtShowPassword.setVisible(false);
    }

    public void loginOnAction(ActionEvent actionEvent) {
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
