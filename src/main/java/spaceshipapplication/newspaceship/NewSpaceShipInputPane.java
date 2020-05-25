package spaceshipapplication.newspaceship;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Text;
import spaceshipapplication.model.SpaceShip;

public class NewSpaceShipInputPane extends GridPane {
    private Text labelModel = new Text("Model");
    private Text labelCaptain = new Text("Captain");
    private Text labelFuel = new Text("Fuel");
    private TextField textFieldModel = new TextField("");
    private TextField textFieldCaptain = new TextField("");
    private TextField textFieldFuel = new TextField("");


    public NewSpaceShipInputPane() {
        initStuff();
    }

    private void initStuff(){
        this.getChildren().addAll(labelModel, textFieldModel,
                labelCaptain, textFieldCaptain,
                labelFuel, textFieldFuel);
        this.setPadding(new Insets(10));
        ColumnConstraints cc1 = new ColumnConstraints(300);
        ColumnConstraints cc2 = new ColumnConstraints(400);
        cc2.setHgrow(Priority.ALWAYS);
        cc2.setHalignment(HPos.RIGHT);
        this.getColumnConstraints().add(0,cc1);
        this.getColumnConstraints().add(1,cc2);
        this.setRowIndex(labelModel, 0);
        this.setRowIndex(textFieldModel, 0);
        this.setColumnIndex(textFieldModel, 1);

        this.setRowIndex(labelCaptain, 1);
        this.setRowIndex(textFieldCaptain, 1);
        this.setColumnIndex(textFieldCaptain, 1);

        this.setRowIndex(labelFuel, 2);
        this.setRowIndex(textFieldFuel, 2);
        this.setColumnIndex(textFieldFuel, 1);
    }

    public SpaceShip spaceship() {
        return new SpaceShip(textFieldModel.getText(), textFieldCaptain.getText(),
                Double.valueOf(textFieldFuel.getText()));
    }
}
