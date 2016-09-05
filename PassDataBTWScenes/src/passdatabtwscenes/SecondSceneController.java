
package passdatabtwscenes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class SecondSceneController implements Initializable {
    
    Data cont = new Data();
    
    @FXML
    private Label gname;
    
    @FXML
    private Label gage;
    
    public void getContainer(Data container){
        cont = container;
        gname.setText(cont.Name);
        gage.setText(cont.Age);
    }
    
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
           
    } 
}
