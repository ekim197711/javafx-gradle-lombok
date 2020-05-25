package spaceshipapplication.newspaceship;

import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import spaceshipapplication.CustomEvent;
import spaceshipapplication.model.DataHandler;

public class NewSpaceShipBottomPane extends HBox {
    private Button buttonOk = null;
    private Button buttonCancel = null;
    private final NewSpaceShipInputPane newSpaceShipInputPane;

    public NewSpaceShipBottomPane(NewSpaceShipInputPane newSpaceShipInputPane) {
        this.newSpaceShipInputPane = newSpaceShipInputPane;
        initStuff();
    }

    private void initStuff(){
        this.setSpacing(10);
        this.setAlignment(Pos.CENTER_RIGHT);
        this.setPadding(new Insets(5));
        this.getChildren().add(getButtonCancel());
        this.getChildren().add(getButtonOk());
    }

    private Button getButtonOk() {
        if (buttonOk == null){
            buttonOk = new Button("OK");
            buttonOk.setOnAction((e)->{
                DataHandler.INSTANCE.createSpaceShip(newSpaceShipInputPane.spaceship());
                fireEvent(new CustomEvent(CustomEvent.SWAP_TO_OVERVIEW));
            });
        }
        return buttonOk;
    }

    private Button getButtonCancel() {
        if (buttonCancel == null){
            buttonCancel = new Button("Cancel");
        }
        return buttonCancel;
    }
}
