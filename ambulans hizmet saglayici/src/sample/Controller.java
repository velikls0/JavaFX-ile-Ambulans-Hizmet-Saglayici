package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller {

    @FXML
    private Button anasayfaBtn, kurumsalBtn, sorularBtn, iletisimBtn, acilBtn, hastaBtn, ucakBtn, revirBtn, evBtn, ambulansBtn, girisBtn, kayitBtn;

    /*@FXML
    private TextField isim, tel, yas, hasta, adres;

    SQLiteJDBC sql = new SQLiteJDBC();

    @FXML
    void initialize(){

        sql.addNewUser(isim.getText(), Integer.parseInt(tel.getText().toString()), adres.getText(), Integer.parseInt(yas.getText().toString()), hasta.getText());

    }*/

    @FXML
    public void kayıt(ActionEvent event) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        Stage window = (Stage) anasayfaBtn.getScene().getWindow();
        window.setScene(new Scene(root, 925, 554));
    }

    @FXML
    public void handleAnasayfa() throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        Stage window = (Stage) anasayfaBtn.getScene().getWindow();
        window.setScene(new Scene(root, 925, 554));
    }

    @FXML
    public void handleKurumsal() throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("kurumsal.fxml"));

        Stage window = (Stage) kurumsalBtn.getScene().getWindow();
        window.setScene(new Scene(root, 925, 554));
    }

    @FXML
    public void handleSorular() throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("sorular.fxml"));

        Stage window = (Stage) sorularBtn.getScene().getWindow();
        window.setScene(new Scene(root, 925, 554));
    }

    @FXML
    public void handleIletisim() throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("ilitisim.fxml"));

        Stage window = (Stage) iletisimBtn.getScene().getWindow();
        window.setScene(new Scene(root, 925, 554));
    }

    @FXML
    public void handleAcil() throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("acil.fxml"));

        Stage window = (Stage) acilBtn.getScene().getWindow();
        window.setScene(new Scene(root, 925, 554));
    }

    @FXML
    public void handleHasta() throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("hasta.fxml"));

        Stage window = (Stage) hastaBtn.getScene().getWindow();
        window.setScene(new Scene(root, 925, 554));
    }

    @FXML
    public void handleUcak() throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("ucak.fxml"));

        Stage window = (Stage) ucakBtn.getScene().getWindow();
        window.setScene(new Scene(root, 925, 554));
    }

    @FXML
    public void handleRevir() throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("revir.fxml"));

        Stage window = (Stage) revirBtn.getScene().getWindow();
        window.setScene(new Scene(root, 925, 554));
    }

    @FXML
    public void handleEv() throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("ev.fxml"));

        Stage window = (Stage) evBtn.getScene().getWindow();
        window.setScene(new Scene(root, 925, 554));
    }

    @FXML
    public void handleAmbulans() throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("ambulans.fxml"));

        Stage window = (Stage) ambulansBtn.getScene().getWindow();
        window.setScene(new Scene(root, 925, 554));
    }

    @FXML
    public void handleGiris() throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("Giris.fxml"));

        Stage window = (Stage) girisBtn.getScene().getWindow();
        window.setScene(new Scene(root, 925, 554));
    }






}
