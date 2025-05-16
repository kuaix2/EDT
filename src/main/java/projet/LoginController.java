package projet;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class LoginController {
    @FXML private TextField emailField;
    @FXML private PasswordField passwordField;
    @FXML private ChoiceBox<String> roleChoice;
    @FXML private Label errorLabel;

    @FXML
    public void initialize() {
        roleChoice.getItems().addAll("Etudiant", "Enseignant", "Administrateur");
        roleChoice.setValue("Etudiant");
    }

    @FXML
    private void handleLogin(ActionEvent event) throws Exception {
        String role = roleChoice.getValue();
        // skip authentication
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/projet/edt/Dashboard.fxml"));
        Parent root = loader.load();
        DashboardController ctrl = loader.getController();
        ctrl.setRole(role);
        Stage stage = (Stage) ((Control)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Dashboard - " + role);
    }
}
