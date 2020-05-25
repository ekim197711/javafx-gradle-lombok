package spaceshipapplication.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public enum DataHandler {
    INSTANCE;
    private List<SpaceShip> spaceShips = null;

    DataHandler() {
        getSpaceShips();
    }

    public ObservableList gimmeAllSpaceShips() {
        return FXCollections.observableArrayList(getSpaceShips());
    }

    private List getSpaceShips() {
        if (spaceShips == null) {
            spaceShips = new ArrayList<>();
            spaceShips.add(new SpaceShip("Round1", "Mike", 99.9d));
            spaceShips.add(new SpaceShip("Round2", "Jane", 65.2d));
            spaceShips.add(new SpaceShip("Pyramid1", "Jan", 29.3d));
            spaceShips.add(new SpaceShip("Pyramid2", "Susan", 20.1d));
        }
        return spaceShips;
    }

    public void createSpaceShip(SpaceShip ship){
        this.spaceShips.add(ship);
    }

    public void deleteSpaceShip(SpaceShip ship){
        this.spaceShips.remove(ship);
    }


}
