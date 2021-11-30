package Voiture;

public abstract class Voiture {
    private String libelle;
    private int prix;
    private int poids;

    public String getLibelle() {
        return libelle;
    }

    protected void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getPrix() {
        return prix;
    }

    protected void setPrix(int prix) {
        this.prix = prix;
    }

    public int getPoids() {
        return poids;
    }

    protected void setPoids(int poids) {
        this.poids = poids;
    }
}
