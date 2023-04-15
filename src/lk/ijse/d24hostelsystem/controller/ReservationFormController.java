package lk.ijse.d24hostelsystem.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import lk.ijse.d24hostelsystem.bo.BOFactory;
import lk.ijse.d24hostelsystem.bo.custom.ReservationBO;

import java.util.List;

public class ReservationFormController {
    public JFXTextField txtReservationId;
    public JFXComboBox cmbStudentId;
    public JFXComboBox cmbRoomID;
    public JFXButton dltReserveOnAction;
    public JFXTextField txtStudentName;
    public JFXTextField txtRoomQty;
    public JFXButton updateReserveOnAction;
    public JFXButton reserveOnAction;
    public TableView tblNotPayed;
    public TableColumn colReserveID;
    public TableColumn colRoomID;
    public TableColumn colStudentID;
    public TableColumn colStudentName;
    public TableColumn colContact;
    public TableColumn colPDate;
    public TableView tblReservation;
    public TableColumn colReserveId;
    public TableColumn colDate;
    public TableColumn colStudentId;
    public TableColumn colRoomTypeID;
    public TableColumn colKeyMoney;
    public JFXCheckBox cbxStatus;

    private ReservationBO reservationBO= (ReservationBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.Reservation);
    private String id;

    public void makeReservationVisibleOnAction(ActionEvent actionEvent) {
    }

    public void updateReservationVisibleOnAction(ActionEvent actionEvent) {
    }

    public void deleteReservationVisibleOnAction(ActionEvent actionEvent) {
    }

    public void dltOnAction(ActionEvent actionEvent) {
    }

    public void updateOnAction(ActionEvent actionEvent) {
    }

    public void reserveOnAction(ActionEvent actionEvent) {
            boolean isSaved = reserveARoom(getData());
            if (isSaved){
                new Alert(Alert.AlertType.CONFIRMATION, "Room Reserved").show();
                tblReservation.getItems().clear();
                tblNotPayed.getItems().clear();

                loadAll();
                setUnpaidDetails();



                //clearFields();
            }else{
                new Alert(Alert.AlertType.ERROR, "Error").show();
            }
        }else {
            if (cbxStatus.isSelected()){
                //btn.setDisable(false);

                String status="paid";

                boolean isUpdated = false;
                try {
                    isUpdated = reservationBO.changePaidStatus(id, status);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                if (isUpdated){
                    tblReservation.getItems().clear();
                    tblNotPayed.getItems().clear();

                    new Alert(Alert.AlertType.CONFIRMATION, "Status updated").show();

                    loadAll();
                    setUnpaidDetails();

                    cbxStatus.setDisable(true);
                    //btnReserve.setDisable(true);
                }else {
                    new Alert(Alert.AlertType.ERROR, "Error").show();
                }

            }else if (!cbxStatus.isSelected());
        }

    private void setCellFactory(){
        colResID.setCellValueFactory(new PropertyValueFactory<>("resID"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        colStudent.setCellValueFactory(new PropertyValueFactory<>("studentID"));
        colRoomTID.setCellValueFactory(new PropertyValueFactory<>("roomID"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));

        colReserveID.setCellValueFactory(new PropertyValueFactory<>("resID"));
        colRoomStatus.setCellValueFactory(new PropertyValueFactory<>("date"));
        colStudentID.setCellValueFactory(new PropertyValueFactory<>("studentID"));
        colRoomID.setCellValueFactory(new PropertyValueFactory<>("roomID"));
        colContact.setCellValueFactory(new PropertyValueFactory<>("contactNo"));
        colSName.setCellValueFactory(new PropertyValueFactory<>("name"));
    }

    private void loadAll() throws Exception {
        List<ReservationDTO> reservationDTOS = reservationBO.loadAll();
        ObservableList<ReservationDTO> dtoObservableList= FXCollections.observableList(reservationDTOS);

        tblResDetails.setItems(dtoObservableList);
    }

    private void setReserveID() throws Exception {
        lblResId.setText(reservationBO.generateNextReservationID());
    }

}
