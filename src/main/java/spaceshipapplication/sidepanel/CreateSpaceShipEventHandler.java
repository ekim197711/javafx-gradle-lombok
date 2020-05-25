package spaceshipapplication.sidepanel;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CreateSpaceShipEventHandler implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent event) {
        log.info("Create BEGIN");

        log.info("Create END");
    }
}
