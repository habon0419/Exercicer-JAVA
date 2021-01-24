/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionetudiant;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import metier.Service;
import models.Classe;
import models.Etudiant;
import models.Personne;

/**
 * FXML Controller class
 *
 * @author habon
 */
public class VInscriptionController implements Initializable {

    
    /*
       Mes attributs
    */
    private Service metier;
    //ObservableList
     ObservableList<Classe> obClasses;
     ObservableList<Etudiant> obEtudiants;
    
    @FXML
    private TextField txtNom;
    @FXML
    private TextField txtPrenom;
    @FXML
    private TextField txtTuteur;
    @FXML
    private TextField txtClasse;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       metier=new Service();
    }    

    @FXML
    private void handleCreerInscription(ActionEvent event) {
         String nom=txtNom.getText();
         String prenom=txtPrenom.getText();
         String tuteur=txtTuteur.getText();
         String classe=txtClasse.getText();
         
          Personne pers=new Personne(nom,prenom,tuteur,classe);
          if (metier.creerPersonne(pers)){
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Personne ajoutée avec success");
            alert.setTitle("Information");
            alert.show();
            //Mettre Jour la Table View
             obClasses.add(cl);
        }else{
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Erreur Insertion");
            alert.setTitle("Erreur");
            alert.show();
        }
    }
    
}
