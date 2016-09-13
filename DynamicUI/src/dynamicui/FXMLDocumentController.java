package dynamicui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.AnchorPane;

public class FXMLDocumentController implements Initializable {
    
    @FXML RadioButton on;
    @FXML RadioButton off;
    @FXML Label label;
    @FXML AnchorPane ap;
    @FXML AnchorPane gap;
    @FXML AnchorPane sgap;
    
    @FXML
    private void radiobuttons(ActionEvent event) throws Exception{
        if(event.getSource()==on){
            gap = FXMLLoader.load(getClass().getResource("GuestFile.fxml"));
            ap.getChildren().setAll(gap);
        } 
        
        else{
            sgap = FXMLLoader.load(getClass().getResource("SecondGuest.fxml"));
            ap.getChildren().setAll(sgap);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
