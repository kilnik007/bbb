package ru.mirea.ED.com.kilnik.education;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Pair;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginController {

    @FXML
    private TextField email;

    @FXML
    private PasswordField pass;

    void leave_func(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Main");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void leave(MouseEvent event) throws IOException {
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        leave_func(stage);
    }

    @FXML
    void login(ActionEvent event) throws IOException, ClassNotFoundException {
        String m = email.getText();
        String p = pass.getText();

        if (p.isEmpty() || m.isEmpty()) {
            return;
        }

        String regexStr = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
        Pattern pattern = Pattern.compile(regexStr);
        Matcher matcher = pattern.matcher(m);

        if (matcher.find()) {
            HashMap<String, Pair<String, Boolean>> map = null;
            try {
                FileInputStream fileIn = new FileInputStream("regdata.ser");
                ObjectInputStream in = new ObjectInputStream(fileIn);

                map = (HashMap<String, Pair<String, Boolean>>) in.readObject();
                in.close();
                fileIn.close();
            } catch (Exception e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("File corrupted!");
                alert.show();
                Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                leave_func(stage);
            }

            if (map.containsKey(m)) {
                Pair<String, Boolean> sec = map.get(m);

                if (sec.getKey().equals(p)) {
                    System.out.println(sec.getValue());
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("Wrong password!");
                    alert.show();
                }
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Cannot find user with this email!");
                alert.show();
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Incorrect email!");
            alert.show();
        }
    }

}