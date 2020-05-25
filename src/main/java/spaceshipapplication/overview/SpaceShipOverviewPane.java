package spaceshipapplication.overview;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import spaceshipapplication.model.DataHandler;
import spaceshipapplication.sidepanel.CreateAndDeletePanel;
import spaceshipapplication.sidepanel.CreateSpaceShipEventHandler;
import spaceshipapplication.sidepanel.DeleteSpaceShipEventHandler;

public class SpaceShipOverviewPane extends BorderPane {
    private Label label = null;
    private SpaceShipTableView spaceShipTableView = null;

    private CreateAndDeletePanel createAndDeletePanel = null;
    public SpaceShipOverviewPane() {
        this.setPadding(new Insets(10));
        initPane();
    }

    private void initPane(){
        this.setMinHeight(400.0d);
        this.setMinWidth(600.0d);
        this.setTop(getLabel());
        this.setCenter(getSpaceShipTableView());
        this.setLeft(getCreateAndDeletePanel());

    }

    private SpaceShipTableView getSpaceShipTableView(){
        if (spaceShipTableView == null){
            spaceShipTableView = new SpaceShipTableView(DataHandler.INSTANCE.gimmeAllSpaceShips());
        }
        return spaceShipTableView;
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

    private CreateAndDeletePanel getCreateAndDeletePanel() {
        if (createAndDeletePanel == null ){
            createAndDeletePanel = new CreateAndDeletePanel(
                    new CreateSpaceShipEventHandler(),
                    new DeleteSpaceShipEventHandler(spaceShipTableView));
        }
        return createAndDeletePanel;
    }
}
