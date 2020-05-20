package spaceshipapplication.overview;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

public class SpaceShipOverviewPane extends BorderPane {
    private Label label = null;
    private SpaceShipTableView spaceShipTableView = null;
    private ObservableList<SpaceShip> spaceShips = null;

    public SpaceShipOverviewPane() {
        this.setPadding(new Insets(10));
        initPane();
    }

    private void initPane(){
        this.setMinHeight(400.0d);
        this.setMinWidth(600.0d);
        this.setTop(getLabel());
        this.setCenter(getSpaceShipTableView());

    }

    private SpaceShipTableView getSpaceShipTableView(){
        if (spaceShipTableView == null){
            spaceShipTableView = new SpaceShipTableView(getSpaceShips());
        }
        return spaceShipTableView;
    }

    private ObservableList getSpaceShips() {
        if (spaceShips == null){
            spaceShips = FXCollections.observableArrayList();
            spaceShips.addAll(
                    new SpaceShip("Round1", "Mike", 99.9d),
                    new SpaceShip("Round2", "Jane", 65.2d),
                    new SpaceShip("Pyramid1", "Jan", 29.3d),
                    new SpaceShip("Pyramid2", "Susan", 20.1d)
                    );
        }
        return spaceShips;
    }

    private Label getLabel(){
        if (label == null)
        {
            label = new Label("This is our space ships");
            label.setFont(new Font(40));
            label.setPadding(new Insets(5, 0,10,0));
            label.setOnMouseClicked(e -> System.out.println("Label CLICKED!!! " + e.getButton() ));
        }
        return label;
    }
}
