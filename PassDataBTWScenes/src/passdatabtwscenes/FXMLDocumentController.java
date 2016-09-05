package passdatabtwscenes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField gname;
    
    @FXML
    private TextField gage;
    
    @FXML
    private Button btn;
    
    @FXML
    private void SubmitEvent(ActionEvent event) throws Exception{
        
        Data container  =new Data();
        
        container.Name = gname.getText();
        container.Age = gage.getText();
        
        Stage stage;
        Parent root;
        FXMLLoader loader = new FXMLLoader();
        stage = (Stage) btn.getScene().getWindow();
        root = loader.load(getClass().getResource("SecondScene.fxml").openStream());
        SecondSceneController sc = (SecondSceneController) loader.getController();
        sc.getContainer(container);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show(); 
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
