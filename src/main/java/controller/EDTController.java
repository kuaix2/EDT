package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class EDTController {
    @FXML private TableView<?> edtTable;
    @FXML private TableColumn<?, ?> colCours, colHeure, colSalle;
    public void initialize() {
        // populate table
    }
}