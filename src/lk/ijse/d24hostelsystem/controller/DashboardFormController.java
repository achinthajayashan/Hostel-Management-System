package lk.ijse.d24hostelsystem.controller;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.util.Duration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DashboardFormController {
    public Label lblTime;

    public void initialize(){
        setDateAndTime();
    }

    private void setDateAndTime() {
        Timeline time = new Timeline(new KeyFrame(Duration.ZERO, e->{
            DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd   HH:mm:ss");
            lblTime.setText(LocalDateTime.now().format(formatter));
        }), new KeyFrame(Duration.seconds(1))
        );
        time.setCycleCount(Animation.INDEFINITE);
        time.play();
    }

    public void reservationOnAction(ActionEvent actionEvent) {
    }

    public void studentsOnAction(ActionEvent actionEvent) {
    }

    public void roomsOnAction(ActionEvent actionEvent) {
    }

    public void signOutOnAction(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void setttingsOnAction(ActionEvent actionEvent) {
    }
}
