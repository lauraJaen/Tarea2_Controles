package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class Controller {

    ObservableList<String> data = FXCollections.observableArrayList(
            "Elemento1","Elemento2", "Elemento3");


    @FXML
    Button btnRight;

    @FXML
    Button btnLeft;

    @FXML
    ListView lstRight;

    @FXML
    ListView lstLeft;

    public void initialize() {
        lstLeft.setItems(data);
       
    }

    public void toRight() {//(MouseEvent event)
       
       // Object item = lstLeft.getSelectionModel().getSelectedItem();
            
    	if (!lstLeft.getItems().isEmpty()) {
    	String item = (String) lstLeft.getSelectionModel().getSelectedItem();
          //  if (item !=null) {
            lstRight.getItems().add(item);
            lstLeft.getItems().remove(item);
            
            
         }
          //  item=null;
    }

    public void toLeft() {
    	String item = (String) lstRight.getSelectionModel().getSelectedItem();
    	 if (item !=null) {
    		 lstRight.getItems().remove(item);
    		 lstLeft.getItems().add(item);
        }
    	 item=null;
    }


}
