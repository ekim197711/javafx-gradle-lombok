package spaceshipapplication.sidepanel;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import spaceshipapplication.CustomEvent;


public class CreateAndDeletePanel extends VBox {
    private Button newSpaceship = null;
    private Button deleteSpaceship = null;
    private final DeleteSpaceShipEventHandler deleteSpaceShipEventHandler;

    public CreateAndDeletePanel(
                                DeleteSpaceShipEventHandler deleteSpaceShipEventHandler) {
        this.deleteSpaceShipEventHandler = deleteSpaceShipEventHandler;
        initStuff();
    }

    private void initStuff(){
        this.setPadding(new Insets(10));
        this.setSpacing(10);
        this.getChildren().add(getNewSpaceship());
        this.getChildren().add(getDeleteSpaceship());

    }

    public Button getNewSpaceship() {
        if (newSpaceship == null){
            newSpaceship = new Button("Create new spaceship");
            newSpaceship.setOnAction((e) ->{
                this.fireEvent(new CustomEvent(CustomEvent.SWAP_TO_CREATE));
            });
        }
        return newSpaceship;
    }

    public Button getDeleteSpaceship() {
        if (deleteSpaceship == null){
            deleteSpaceship = new Button("Delete selected spaceship");
            deleteSpaceship.setOnAction(deleteSpaceShipEventHandler);
        }
        return deleteSpaceship;
    }
}
