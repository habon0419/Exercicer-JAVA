/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;



import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Classe;

/**
 *
 * @author habon
 */
public class DaoClasse implements IDao<Classe> {
    private  final String SQL_INSERT="INSERT INTO `classe` (`id`, `libelle`, `nbre`) VALUES (?,?);";
     private final String SQL_SELECT_ALL="select * from classe";
    @Override
     public int insert(Classe classe){
        int nbreLigne=0;
        try{
               mysql.ouvrirConnexionBD();
               mysql.preparerRequete(SQL_INSERT);
               //Remplacer la variation de la requete par les valeur  
                  mysql.getPs().setString(1,classe.getLibelle());
                  mysql.getPs().setInt(2,classe.getNbre());
                 //Executer la requete
                  nbreLigne= mysql.executeMisAjour();
                 }catch (SQLException ex) {
            Logger.getLogger(DaoClasse.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             mysql.closeConnexion(); 
        }
             
        return nbreLigne;
    }
 
     public List<Classe> findAll(){
            List <Classe> lClasses=new ArrayList<>();
         try {
           
               mysql.ouvrirConnexionBD();
               mysql.preparerRequete(SQL_INSERT);
               ResultSet rs=mysql.executeSelect();
               while(rs.next()){
                   Classe cl=new Classe();
                           cl.setId(rs.getInt("id"));
                           cl.setLibelle(rs.getString("libelle"));
                           cl.setNbre(rs.getInt("nbre_etudiant"));
                              lClasses.add(cl);
                              
                              
             }catch (SQLException ex) {
            Logger.getLogger(DaoClasse.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             mysql.closeConnexion(); 
        }
        
     }
    return lClasses;
}
