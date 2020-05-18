import javafx.application.Application;
import javafx.stage.Stage;

public class SpaceShipFXApplication extends Application {

    public static void main(String[] args) {
        System.out.println("BEGIN");
        launch(args);
        System.out.println("END");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Spaceship Overview");
        primaryStage.setScene(new SpaceshipOverviewScene());
        primaryStage.show();
    }
}
