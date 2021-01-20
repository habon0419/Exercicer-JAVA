/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import models.Classe;
import models.Details;

/**
 *
 * @author habon
 */
public class DaoDetails implements IDao<Details>  {
     private  final String SQL_INSERT="INSERT INTO `details` (`classe_id`, `professeur_id`, `année`, `modules`) VALUES (?,?,?,?);";
     private final String SQL_SELECT_MODULES="select * from details where professeur_id=? and classe_id=?";
     
     
     @Override
     public int insert(Details details){
        int nbreLigne=0;
        //Traitement insertion
        return nbreLigne;
    }
     
     public List<String> findModules(Details details){
    List<String> lModules=new ArrayList<>();
    //Recuperation
    return lModules;
    
}
     

    public List<Details> findModulesByClasse(Classe classe){
        List<Details> lModules=new ArrayList<>();
        return lModules;
    }
}
