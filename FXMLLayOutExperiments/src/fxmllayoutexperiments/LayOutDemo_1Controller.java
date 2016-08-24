package fxmllayoutexperiments;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LayOutDemo_1Controller implements Initializable {
    
    @FXML
    AnchorPane ap;
    
    @FXML
    ImageView img;
    
    @FXML
    private Button nxt;
    
    @FXML
    Node node;
    
    @FXML
    private void initilizeLogInScreen(ActionEvent event) throws Exception{
        
        Stage stage;
        Parent root;
        if(event.getSource()==ap){
            stage = (Stage) ap.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("LogInScreen.fxml"));
            
        }
        else if(event.getSource()==img){
            stage = (Stage)img.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("LogInScreen.fxml"));
            
        }
        else{
             stage = (Stage) nxt.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("LogInScreen.fxml"));
            
        }
        
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.show();    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
       System.out.println("Hello Aksh");
       /*try{
        Stage stage = null;
        Parent root;
       
        stage =(Stage) .getClass().getClass();
        root = FXMLLoader.load(getClass().getResource("LogInScreen.fxml"));
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
       }
        catch(Exception ex){
            
        } */      
    }    
}
