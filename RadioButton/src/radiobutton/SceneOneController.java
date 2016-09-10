package radiobutton;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class SceneOneController implements Initializable {
    
    @FXML RadioButton rdobase;
    @FXML RadioButton rdosport;
    @FXML RadioButton rdodelux;
    @FXML CheckBox chkextend;
    @FXML CheckBox chkrust;
    @FXML Button btncalculate;
    @FXML Label lblbase;
    @FXML Label lblextra;
    @FXML Label lbltotal;
    
    @FXML ToggleGroup rdiobtn;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        int base , extra=0 , total;
        //which single radio button is selected?
        if(rdobase.isSelected()) base = 17500;
        else if(rdosport.isSelected()) base = 19700;
        else base = 21300;
        
        // which check box is selected
        if(chkrust.isSelected()) extra+=800;
        if(chkrust.isSelected()) extra+=500;
        
        //calculate total and displaty every thing
        total = base + extra;
        
        lblbase.setText("Base:\t$"+base);
        lblextra.setText("Extra:\t$"+extra);
        lbltotal.setText("Total:\t$"+total);
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
