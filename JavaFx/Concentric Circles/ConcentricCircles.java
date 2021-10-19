import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;

public class ConcentricCircles extends Application{
    @Override
   public void start(Stage stage) throws Exception {
      // loads DrawLines.fxml and configures the DrawLinesController
      Parent root = 
         FXMLLoader.load(getClass().getResource("ConcentricCircles.fxml"));

      Scene scene = new Scene(root); // attach scene graph to scene
      stage.setTitle("Draw Circles"); // displayed in window's title bar
      stage.setScene(scene); // attach scene to stage
      stage.show(); // display the stage
   }
    public static void main(String[] args) {
        launch(args);
    }
}