/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author habon
 */
public abstract class Personne {
    protected int id ;
    protected String NomComplet;
    
    
     //Defaut

    public Personne() {
    }

    public Personne(int id, String NomComplet) {
        this.id = id;
        this.NomComplet = NomComplet;
    }

    public Personne(String NomComplet) {
        this.NomComplet = NomComplet;
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
        return "Personne{" + "id=" + id + ", NomComplet=" + NomComplet + '}';
    }

  
    
    
}
