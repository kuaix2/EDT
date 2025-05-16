package projet;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class Utils {
    public static void loadScene(MenuItem source, String fxml, String title) throws Exception {
        FXMLLoader loader = new FXMLLoader(Utils.class.getResource("/projet/edt/" + fxml));
        Parent root = loader.load();
        Stage stage = (Stage) source.getParentPopup().getOwnerWindow();
        stage.setScene(new Scene(root));
        stage.setTitle(title);
    }
}
