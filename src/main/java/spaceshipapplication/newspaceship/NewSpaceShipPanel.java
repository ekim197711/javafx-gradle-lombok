package spaceshipapplication.newspaceship;

import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

public class NewSpaceShipPanel extends BorderPane {
    private NewSpaceShipBottomPane newSpaceShipBottomPane = null;
    private NewSpaceShipInputPane newSpaceShipInputPane = null;
    public NewSpaceShipPanel() {
        initStuff();
    }

    private void initStuff(){
        this.setBottom(getNewSpaceShipBottomPane());
        setAlignment(getNewSpaceShipBottomPane(), Pos.CENTER_RIGHT);
        this.setPrefHeight(600);
        this.setPrefWidth(800);
        this.setTop(new Text("Create new Spaceship"));
        this.setCenter(getNewSpaceShipInputPane());
    }

    private  NewSpaceShipBottomPane getNewSpaceShipBottomPane() {
        if (newSpaceShipBottomPane == null){
            newSpaceShipBottomPane = new NewSpaceShipBottomPane(
                    getNewSpaceShipInputPane());
        }
        return newSpaceShipBottomPane;
    }

    private NewSpaceShipInputPane getNewSpaceShipInputPane() {
        if (newSpaceShipInputPane == null){
            newSpaceShipInputPane = new NewSpaceShipInputPane();
        }
        return newSpaceShipInputPane;
    }
}
