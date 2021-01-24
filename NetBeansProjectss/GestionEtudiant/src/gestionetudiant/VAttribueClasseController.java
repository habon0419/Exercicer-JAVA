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
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
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
public class VAttribueClasseController implements Initializable {
    
    
     
    /*
       Mes attributs
    */
    private Service metier;
    //ObservableList
     ObservableList<Classe> obClasses;
     ObservableList<Etudiant> obEtudiants;
    

    @FXML
    private TextField txtMatriculer;
    @FXML
    private TextField txtNom;
    @FXML
    private TextField txtGrade;
    @FXML
    private TextField txtPrenom;
    @FXML
    private TextField txtClasse;
    @FXML
    private TextField txtModules;
    @FXML
    private TabPane tblvModules;
    @FXML
    private Tab tblvCLibelle;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleCreerClasse(ActionEvent event) {
         String matriculer=txtMatriculer.getText();
         String nom=txtNom.getText();
         String grade=txtGrade.getText();
         String prenom=txtPrenom.getText();
         String classe=txtClasse.getText();
         String modules=txtModules.getText();
         
         
         
         
          Personne pers=new Personne(matriculer,nom,prenom,grade,classe,modules);
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
