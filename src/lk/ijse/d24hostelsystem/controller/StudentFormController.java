package lk.ijse.d24hostelsystem.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;
import lk.ijse.d24hostelsystem.dto.StudentDto;
import lk.ijse.d24hostelsystem.util.Navigation;
import lk.ijse.d24hostelsystem.util.Routes;

import java.io.IOException;

public class StudentFormController {
    public AnchorPane studentPane;
    public  JFXTextField txtStudentName;
    public  JFXTextField txtStudentId;
    public  JFXTextField txtStudentNic;
    public  JFXTextField txtStudentHomeTown;
    public  JFXDatePicker txtStudentDob;
    public  JFXComboBox cmbStudentGender;
    public  JFXTextField txtStudentPhoneNumber;
    public  JFXButton deleteStudentVisibleOnAction;
    public  JFXTextField txtStudentUniversity;
    public JFXButton btnSaveStudent;
    public JFXButton btnSearchStudent;
    public JFXButton btnUpdateStudent;
    public JFXButton btnClear;
    public JFXButton btnDeleteStudent;

    public void initialize(){
        txtStudentName.setDisable(true);
        txtStudentId.setDisable(true);
        txtStudentNic.setDisable(true);
        txtStudentHomeTown.setDisable(true);
        txtStudentDob.setDisable(true);
        cmbStudentGender.setDisable(true);
        txtStudentPhoneNumber.setDisable(true);
        txtStudentUniversity.setDisable(true);
        btnSaveStudent.setDisable(true);
        btnSearchStudent.setDisable(true);
        btnUpdateStudent.setDisable(true);
        btnDeleteStudent.setDisable(true);
        btnClear.setDisable(true);
    }

    public void goBackOnAction(ActionEvent actionEvent) throws IOException {

    }

    public void addStudentVisibleOnAction(ActionEvent actionEvent) {
        txtStudentName.setDisable(false);
        txtStudentId.setDisable(false);
        txtStudentNic.setDisable(false);
        txtStudentHomeTown.setDisable(false);
        txtStudentDob.setDisable(false);
        cmbStudentGender.setDisable(false);
        txtStudentPhoneNumber.setDisable(false);
        txtStudentUniversity.setDisable(false);
        btnSaveStudent.setDisable(false);
        btnClear.setDisable(false);
        btnSearchStudent.setDisable(true);
        btnUpdateStudent.setDisable(true);
        btnDeleteStudent.setDisable(true);
    }

    public void updateStudentVisibleOnAction(ActionEvent actionEvent) {
        txtStudentName.setDisable(true);
        txtStudentId.setDisable(false);
        txtStudentNic.setDisable(true);
        txtStudentHomeTown.setDisable(true);
        txtStudentDob.setDisable(true);
        cmbStudentGender.setDisable(true);
        txtStudentPhoneNumber.setDisable(true);
        txtStudentUniversity.setDisable(true);
        btnSaveStudent.setDisable(true);
        btnSearchStudent.setDisable(false);
        btnUpdateStudent.setDisable(true);
        btnDeleteStudent.setDisable(true);
        btnClear.setDisable(true);
    }

    public void saveStudentOnAction(ActionEvent actionEvent) {
       // getStudentDto();
        StudentDto studentDto=new StudentDto();
        studentDto.setStudentId(txtStudentId.getText());
        studentDto.setStudentName(txtStudentName.getText());
        studentDto.setHomeTown(txtStudentHomeTown.getText());

    }

    public void searchStudentOnAction(ActionEvent actionEvent) {
        txtStudentName.setDisable(false);
        txtStudentId.setDisable(false);
        txtStudentNic.setDisable(false);
        txtStudentHomeTown.setDisable(false);
        txtStudentDob.setDisable(false);
        cmbStudentGender.setDisable(false);
        txtStudentPhoneNumber.setDisable(false);
        txtStudentUniversity.setDisable(false);
        btnSaveStudent.setDisable(true);
        btnSearchStudent.setDisable(true);
        btnUpdateStudent.setDisable(false);
        btnDeleteStudent.setDisable(true);
        btnClear.setDisable(true);
    }

    public void updateStudentOnAction(ActionEvent actionEvent) {
    }

    public void clearOnAction(ActionEvent actionEvent) {
        txtStudentName.clear();
        //txtStudentId.clear();
        txtStudentNic.clear();
        txtStudentHomeTown.clear();
        txtStudentPhoneNumber.clear();
        txtStudentUniversity.clear();
    }

    public void deleteStudentOnAction(ActionEvent actionEvent) {
    }

    public void deleteStudentVisibleOnAction(ActionEvent actionEvent) {
        txtStudentName.setDisable(true);
        txtStudentId.setDisable(false);
        txtStudentNic.setDisable(true);
        txtStudentHomeTown.setDisable(true);
        txtStudentDob.setDisable(true);
        cmbStudentGender.setDisable(true);
        txtStudentPhoneNumber.setDisable(true);
        txtStudentUniversity.setDisable(true);
        btnSaveStudent.setDisable(true);
        btnSearchStudent.setDisable(true);
        btnUpdateStudent.setDisable(true);
        btnDeleteStudent.setDisable(false);
        btnClear.setDisable(true);
    }
    //String name= txtStudentName.getText();
    private  StudentDto getStudentDto(){
        StudentDto studentDto=new StudentDto();
        studentDto.setStudentId(txtStudentId.getText());
        studentDto.setStudentName(txtStudentName.getText());
        studentDto.setHomeTown(txtStudentHomeTown.getText());

        return studentDto;
    }
}
