/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionetudiant;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import metier.Service;
import models.Personne;

/**
 *
 * @author user
 */
public class ConnexionController implements Initializable {
  
       /*
       Mes attributs
    */
    private Service metier;
    
   
    @FXML
    private TextField txtLogin;
    @FXML
    private PasswordField txtPwd;
    @FXML
    private Text lblError;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        lblError.setVisible(false);
        metier=new Service();
    }    

    @FXML
    private void handleConnexion(ActionEvent event) throws IOException {
        String login=txtLogin.getText();
        String pwd=txtPwd.getText();
        Personne pers=metier.seConnecter(login, pwd);
        if(pers==null){
            lblError.setVisible(true);
        }else{
            //Ferme la fénetre de connexion
            txtLogin.getScene().getWindow().hide();
            //Ouvrir le fenetre menu
           AnchorPane view= FXMLLoader
                   .load(getClass()
                           .getResource("vmenu.fxml"));
          Scene scene=new Scene(view);
          Stage stage=new Stage();
             stage.setScene(scene);
             stage.showAndWait();
        }
    }

    @FXML
    private void lblError(MouseEvent event) {
    }

    
    
}
