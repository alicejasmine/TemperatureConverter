import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        System.out.println("running");
        Main.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception { //stage is the entire window. scene is added to the stage and can change
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TemperatureConversion.fxml"));
        Parent root = loader.load(); //parent is the content of the scene
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}