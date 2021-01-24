/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionetudiant;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SortEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.util.Callback;
import metier.Service;
import models.Etudiant;
import models.Professeur;

/**
 * FXML Controller class
 *
 * @author habon
 */
public class VProfesseurController implements Initializable {

    /*
       Mes attributs
    */
    private Service metier;
    
    ObservableList<Professeur> obProfesseur;
    ObservableList<Etudiant> obEtudiant;
     
    
    
    @FXML
    private Pane txtClasses;
    @FXML
    private TableColumn<Professeur, String> tblcId;
    @FXML
    private TableColumn<Professeur, String> tblcNom;
    @FXML
    private TableColumn<Professeur, String> tblcGrade;
    @FXML
    private TableView<Professeur> tblvProfesseur;
    @FXML
    private TableView<Etudiant> tblvModules;
    @FXML
    private TableColumn<Etudiant,String > tblLibelle;
    @FXML
    private TableColumn<Etudiant,String > tblcClasse;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        metier=new Service();
         //Chargement de ObservableList à partir de List de Classe
       obProfesseur=FXCollections.
                 observableArrayList(
                          metier.listerProfesseur()
               );
          loadTable();
    }
    
    private void loadTable(){
         //Construction des cellule de Table
       tblcId.setCellValueFactory(new PropertyValueFactory<>("id"));
       tblcNom.setCellValueFactory(new PropertyValueFactory<>("nom"));
       tblcGrade.setCellValueFactory(new PropertyValueFactory<>("grade"));
       //TableView se Souscrit à L'observable
         tblvProfesseur.setItems(obProfesseur);
    }

    @FXML
    private void handleShoweEtudiant(MouseEvent event) {
           //Recuperer la Classe Selectionnée
        Professeur classeSelected=tblvProfesseur
                              .getSelectionModel()
                              .getSelectedItem();
        obEtudiant=FXCollections
                .observableArrayList(
                                metier.listerEtudiantParClasse(classeSelected));
        //Construire les colonnes
        tblLibelle.setCellValueFactory(new PropertyValueFactory<>("Libelle"));
        tblcClasse.setCellValueFactory(new PropertyValueFactory<>("Classe"));
        
        //Souscription
        tblvProfesseur.setItems(obProfesseur);
    }
    
    }
}
