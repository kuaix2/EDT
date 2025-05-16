package projet;

import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

public class DashboardController {
    @FXML private MenuItem menuEdt;
    @FXML private MenuItem menuCours;
    @FXML private MenuItem menuSalles;
    private String role;

    public void setRole(String role) {
        this.role = role;
        // customize view based on role
    }
    @FXML private void openEdt() throws Exception {
        Utils.loadScene(menuEdt, "EDT.fxml", "Emploi du Temps");
    }
    @FXML private void openCours() throws Exception {
        Utils.loadScene(menuCours, "GestionCours.fxml", "Gestion des Cours");
    }
    @FXML private void openSalles() throws Exception {
        Utils.loadScene(menuSalles, "GestionSalles.fxml", "Gestion des Salles");
    }
}
