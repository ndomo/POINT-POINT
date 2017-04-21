/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication12;

/**
 *
 * @author proxy giga
 */
public class Etudiant {
    private String etuNom;
    private String etuSex;
    private String etuMatri;
    private String etuMoy;
    private String filiere;
    private String etuPrenom;

    public String getEtuNom() {
        return etuNom;
    }

    public void setEtuNom(String etuNom) {
        this.etuNom = etuNom;
    }

    public String getEtuSex() {
        return etuSex;
    }

    public void setEtuSex(String etuSex) {
        this.etuSex = etuSex;
    }

    public String getEtuMatri() {
        return etuMatri;
    }

    public void setEtuMatri(String etuMatri) {
        this.etuMatri = etuMatri;
    }

    public String getEtuMoy() {
        return etuMoy;
    }

    public void setEtuMoy(String etuMoy) {
        this.etuMoy = etuMoy;
    }

    public String getEtuPrenom() {
        return etuPrenom;
    }

    public void setEtuPrenom(String etuPrenom) {
        this.etuPrenom = etuPrenom;
    }
    
    
    
    
    
    
    
    
    public String description(){
        return "L'étudiant "+etuNom+" "+etuPrenom+" "+etuSex+" de matrile  "
                + " "+etuMatri+" de la filiere "+filiere+"ayant  composé les ues etuUes a une mpyenne "
                + " de "+etuMoy+"";
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    
}
