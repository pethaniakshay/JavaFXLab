package scenechangeexperiments;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ThirdSceneController implements Initializable {

    @FXML
    private Button bk3;
    
    @FXML
    private Button finish;
    
    @FXML
    private void nextScene(ActionEvent event) throws Exception{
        
         Stage stage;
        Parent root;
        
    
        if(event.getSource()==bk3){
            stage = (Stage) bk3.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("SecondScene.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        else{
            stage = (Stage) finish.getScene().getWindow();
            stage.close();
        }
          
         
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
