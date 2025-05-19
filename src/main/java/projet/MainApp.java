package projet;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Load the main view (adjust path if needed)
            Parent root = FXMLLoader.load(getClass().getResource("/projet/edt/MainView.fxml"));
            Scene scene = new Scene(root);

            primaryStage.setTitle("Gestion de l'emploi du temps");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace(); // You can also use a dialog to show user-friendly error
        }
    }

    public static void main(String[] args) {
        launch(args); // Launches the JavaFX application
    }
}
