/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import models.Etudiant;
import models.Classe;
import models.Personne;
import models.Professeur;

/**
 *
 * @author habon
 */
public class DaoPersonne implements IDao<Personne>  {
      private final String SQL_SELECT_BY_CLASSE="select * personne where type='Etudiant'and classe_id=?";
      private final String SQL_INSERT="INSERT INTO `personne` ( `nom_complet`, `type`, `tuteur`, `modules`, `grade`, `classe_id`) VALUES (?,?,?,?,?,?);";
      private final String SQL_SELECT_PROFESSEUR="select * from personne where matricule=?";
      private final String SQL_SELECT_ALL_PROFESSEUR="select * from personne where type='Professeur'";  
      private final String SQL_SELECT_CONNECT="select * from personne where login=? and pwd=?";
         
      public List<Personne> findByClasse(Classe classe){
    List<Personne> lEtudiants=new ArrayList<>();
    //Recuperation
    return lEtudiants;
    
}
      
      @Override
      public int insert (Personne pers){
    int nbreLigne=0;
    //Traitement Insertion
    return nbreLigne;
    
  }
      
      public Professeur findProfesseurByMatricule(String matricule){
            Professeur professeur=null;
            //Recherche de professeur
            return professeur;
}

   public List<Professeur> findProfesseur(){
        List <Professeur> lProfesseurs=new ArrayList<>();
        
        //Recuperation des professeur
        return lProfesseurs;
    }
   
  public Personne findUserConnect(String login,String pwd){
        Personne pers=null;
        //Traitement de connexion
        return pers;
    }

    
   
}
