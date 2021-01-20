/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author habon
 */
public class Professeur extends Personne{
     private String grade;
     private List<String> modules=new ArrayList ();
     private String matricule;
    public Professeur() {
        type="Etudiant";
    }

    public Professeur(String grade, int id, String NomComplet) {
        super(id, NomComplet);
        this.grade = grade;
         type="Etudiant";
    }

    public Professeur(String grade, String NomComplet) {
        super(NomComplet);
        this.grade = grade;
         type="Etudiant";
    }

    

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomComplet() {
        return NomComplet;
    }

    public void setNomComplet(String NomComplet) {
        this.NomComplet = NomComplet;
    }

    @Override
    public String toString() {
        return super.toString()+"Grade:"+grade; //To change body of generated methods, choose Tools | Templates.
    }

    public List<String> getModules() {
        return modules;
    }

    public void setModules(List<String> modules) {
        this.modules = modules;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    
    
    

   
     
    
}
