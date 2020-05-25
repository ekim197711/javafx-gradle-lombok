package spaceshipapplication.sidepanel;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import spaceshipapplication.model.DataHandler;
import spaceshipapplication.model.SpaceShip;
import spaceshipapplication.overview.SpaceShipTableView;

import java.util.Optional;

@RequiredArgsConstructor
@Slf4j
public class DeleteSpaceShipEventHandler implements EventHandler<ActionEvent> {
    private final SpaceShipTableView spaceShipTableView;
    @Override
    public void handle(ActionEvent event) {
        log.info("Delete ship");
        SpaceShip spaceShip = (SpaceShip)spaceShipTableView.getSelectionModel().getSelectedItem();
        if (spaceShip == null)
            return;
        ButtonType yes = new ButtonType("Yeah I can just restart to get it back", ButtonBar.ButtonData.OK_DONE);
        ButtonType no = new ButtonType("Naaaa cancel plz", ButtonBar.ButtonData.CANCEL_CLOSE);
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
                "Are you sure? - The Spaceship will be gone for ever...",yes, no
                );
        alert.setTitle("Do you want to delete the spaceship");
        alert.setHeaderText("Delete the ship: " + spaceShip);

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == yes){
            DataHandler.INSTANCE.deleteSpaceShip(spaceShip);
            spaceShipTableView.setItems(DataHandler.INSTANCE.gimmeAllSpaceShips());
        } else {
            log.info("Cancel - I need the spaceship!");
        }
        log.info("Delete ship end");

    }
}
