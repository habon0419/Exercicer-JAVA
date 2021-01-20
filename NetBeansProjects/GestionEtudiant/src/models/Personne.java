/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author habon
 */
public abstract class Personne {
    protected int id ;
    protected String NomComplet;
    protected String type;
    protected String login;
    protected String pwd;
    
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

   

  
    
    
}
