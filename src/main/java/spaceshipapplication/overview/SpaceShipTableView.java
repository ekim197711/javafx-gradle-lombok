package spaceshipapplication.overview;

import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
public class SpaceShipTableView extends TableView {
    public SpaceShipTableView() {
        initTable();
    }

    public SpaceShipTableView(ObservableList items) {
        super(items);
        initTable();
    }

    private void initTable(){
        TableColumn<String, SpaceShip> columnModel = new TableColumn("Model");
        columnModel.setCellValueFactory(new PropertyValueFactory("model"));

        TableColumn<String, SpaceShip> columnCaptain = new TableColumn("Captain");
        columnCaptain.setCellValueFactory(new PropertyValueFactory("captain"));

        TableColumn<Double, SpaceShip> columnFuel = new TableColumn("Fuel");
        columnFuel.setCellValueFactory(new PropertyValueFactory("fuel"));

        this.getColumns().addAll(columnModel, columnCaptain, columnFuel);
    }
}
