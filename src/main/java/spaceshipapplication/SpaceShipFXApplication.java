package spaceshipapplication;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;
import spaceshipapplication.newspaceship.NewSpaceShipScene;
import spaceshipapplication.overview.SpaceshipOverviewScene;

@Slf4j
public class SpaceShipFXApplication extends Application {
    NewSpaceShipScene newSpaceShipScene;
    SpaceshipOverviewScene spaceshipOverviewScene;
    public static void main(String[] args) {
        System.out.println("BEGIN");
        launch(args);
        System.out.println("END");
    }
    private Stage primaryStage = null;
    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Spaceship Overview");
        primaryStage.setScene(getSpaceshipOverviewScene());
        primaryStage.show();
    }

    private NewSpaceShipScene getNewSpaceShipScene() {
        if (newSpaceShipScene == null){
            newSpaceShipScene = new NewSpaceShipScene();
            newSpaceShipScene.addEventFilter(CustomEvent.SWAP_TO_OVERVIEW,(e) ->{
                log.info("Swap to overview...");
                primaryStage.setScene(getSpaceshipOverviewScene());
                getSpaceshipOverviewScene().refreshData();
            });
        }
        return newSpaceShipScene;
    }

    private SpaceshipOverviewScene getSpaceshipOverviewScene() {
        if (spaceshipOverviewScene == null){
            spaceshipOverviewScene = new SpaceshipOverviewScene();
            spaceshipOverviewScene.addEventFilter(CustomEvent.SWAP_TO_CREATE,(e) ->{
                log.info("Swap to create...");
                primaryStage.setScene(getNewSpaceShipScene());
            });
        }
        return spaceshipOverviewScene;
    }
}
