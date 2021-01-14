/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours.list;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author habon
 */
public class exercice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       /*
        1-creer une liste String
        2-ajouter des elements
        3-affichage de la liste 
        4-suprume des eleements
        5-modifier un element de la liste
        6-modifier un element de la liste
         
        */  
        
        
        
        
        
        
        
        //1-creer une liste String
        
         List<String> lString=new ArrayList ();
            
            
         // 2-Ajouter des elements
    lString.add("Bonjour");
    lString.add("Au revoir");
    lString.add("Les etudiants de la LIAGE3");
    
    //3-Afficher element de la list
    //Method
      for(String elt:lString){
          System.out.println(elt);
      }
      lString.add(0,"Debut");
      lString.forEach ((elt) -> {
          System.out.println(elt);
      });
      
      //4-Supprimet des elts
      lString.remove("Debut");
      lString.remove(2);
      System.out.println("Afficher apres Suppreseion");
      lString.forEach((elt) -> {
          System.out.println(elt);
      });
      
      //5-Modifier un élément de la liste
      lString.set(0,"Bonsoir");
      System.out.println("Afficher apres modification");
      lString.forEach((elt) ->{
          System.out.println(elt);
      });
      
      //6-Rechercher un element de la liste
      if(lString.contains("bonsoir")==true){
          System.out.println("element existe");
      }else{
          System.out.println("element n'existe pas");

     }
    
    
        
        
        
    }
 
  
}

