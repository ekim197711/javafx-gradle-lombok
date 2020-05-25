package spaceshipapplication.overview;

import javafx.event.EventType;
import javafx.scene.Scene;

public class SpaceshipOverviewScene extends Scene {
    private SpaceShipOverviewPane pane;
    public SpaceshipOverviewScene() {
        super(new SpaceShipOverviewPane());
        pane = (SpaceShipOverviewPane)getRoot();
    }
    public void refreshData(){
        pane.refreshData();
    }
}
