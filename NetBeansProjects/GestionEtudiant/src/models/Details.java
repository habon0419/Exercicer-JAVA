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
public class Details {
    private String annee;
    private List<String> modules;
    //ManytoOne
    private Classe Classe ;
    private Professeur professeur;

    public Details(String annee) {
        this.annee = annee;
    }

    public Details() {
    }

    public Details(Classe Classe, Professeur professeur) {
        this.Classe = Classe;
        this.professeur = professeur;
    }

    
    
    public Details(String annee, List<String> modules, Classe Classe, Professeur professeur) {
        this.annee = annee;
        this.modules = modules;
        this.Classe = Classe;
        this.professeur = professeur;
    }
    
    
    
    
    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public List<String> getModules() {
        return modules;
    }

    public void setModules(List<String> modules) {
        this.modules = modules;
    }

    public Classe getClasse() {
        return Classe;
    }

    public void setClasse(Classe Classe) {
        this.Classe = Classe;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }
    
    
    
    
    
}
