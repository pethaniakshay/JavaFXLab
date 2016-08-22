package popupmenu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    Button btn1;
    
    @FXML
    Button btn2;
    
    @FXML
    private void showPopUp(ActionEvent event) throws Exception {
        
        Stage stage = new Stage();
        Parent root;
        //stage = (Stage) btn1.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("PopUp.fxml"));
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(btn1.getScene().getWindow());
        stage.showAndWait();
    }
    
    @FXML
    private void closePopUp(ActionEvent event){
        Stage stage;
        stage = (Stage) btn2.getScene().getWindow();
        stage.close();      
    }
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
