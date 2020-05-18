import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class SpaceShipOverviewPane extends VBox {
    private Button button = null;
    private Label label = null;

    public SpaceShipOverviewPane() {
        this.setSpacing(20.0d);
        this.setPadding(new Insets(10, 10, 10, 10));
        this.getChildren().add(getLabel());
        this.getChildren().add(getButton());
        this.setMinHeight(400.0d);
        this.setMinWidth(600.0d);
    }

    private Label getLabel(){
        if (label == null)
        {
            label = new Label("Cool button... That way -> (next line)");
            label.setOnMouseClicked(e -> System.out.println("Label CLICKED!!! " + e.getButton() ));
        }
        return label;
    }

    private Button getButton(){
        if (button == null)
        {
            button = new Button("Press this button to write stuff in console");
            button.setOnAction(e -> System.out.println("Button CLICKED!!! "));
        }
        return button;
    }
}
