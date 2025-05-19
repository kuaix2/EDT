package model;

public class Salle {
    private int id;
    private String numero;
    private int capacite;
    private String equipement;

    //Constructor
    public Salle(int id, String numero, int capacite, String equipement) {
        this.id = id;
        this.numero = numero;
        this.capacite = capacite;
        this.equipement = equipement;
    }

    @Override
    public String toString() {
        return "SALLE \n" +
                "id:" + id + "\n+" +
                "numero: " + numero + "\n" +
                "capacite:" + capacite + "\n" +
                "equipement" + equipement;
    }
}
