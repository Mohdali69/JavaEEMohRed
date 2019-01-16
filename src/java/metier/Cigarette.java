/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author Asus
 */
public class Cigarette {
    private String nom;
    private int id;
    private int ingredient1;
    private int prix;
    private int ingredient2;
    private int ingredient3;
    private int ingredient4;
    private int ingredient5;
    private int ingredient6;
    private String commentaire;
    
    public Cigarette(String nom,int id,int ingredient1,int prix,int ingredient2,int ingredient3,int ingredient4,int ingredient5,int ingredient6,String commentaire){
        this.nom= nom;
        this.prix=prix;
        this.commentaire=commentaire;
        this.id=id;
        this.ingredient1=ingredient1;
        this.ingredient2=ingredient2;
        this.ingredient3=ingredient3;
        this.ingredient4=ingredient4;
        this.ingredient5=ingredient5;
        this.ingredient6=ingredient6;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the ingredient1
     */
    public int getIngredient1() {
        return ingredient1;
    }

    /**
     * @param ingredient1 the ingredient1 to set
     */
    public void setIngredient1(int ingredient1) {
        this.ingredient1 = ingredient1;
    }

    /**
     * @return the prix
     */
    public int getPrix() {
        return prix;
    }

    /**
     * @param prix the prix to set
     */
    public void setPrix(int prix) {
        this.prix = prix;
    }

    /**
     * @return the ingredient2
     */
    public int getIngredient2() {
        return ingredient2;
    }

    /**
     * @param ingredient2 the ingredient2 to set
     */
    public void setIngredient2(int ingredient2) {
        this.ingredient2 = ingredient2;
    }

    /**
     * @return the ingredient3
     */
    public int getIngredient3() {
        return ingredient3;
    }

    /**
     * @param ingredient3 the ingredient3 to set
     */
    public void setIngredient3(int ingredient3) {
        this.ingredient3 = ingredient3;
    }

    /**
     * @return the ingredient4
     */
    public int getIngredient4() {
        return ingredient4;
    }

    /**
     * @param ingredient4 the ingredient4 to set
     */
    public void setIngredient4(int ingredient4) {
        this.ingredient4 = ingredient4;
    }

    /**
     * @return the ingredient5
     */
    public int getIngredient5() {
        return ingredient5;
    }

    /**
     * @param ingredient5 the ingredient5 to set
     */
    public void setIngredient5(int ingredient5) {
        this.ingredient5 = ingredient5;
    }

    /**
     * @return the ingredient6
     */
    public int getIngredient6() {
        return ingredient6;
    }

    /**
     * @param ingredient6 the ingredient6 to set
     */
    public void setIngredient6(int ingredient6) {
        this.ingredient6 = ingredient6;
    }

    /**
     * @return the commentaire
     */
    public String getCommentaire() {
        return commentaire;
    }

    /**
     * @param commentaire the commentaire to set
     */
    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
    
}
