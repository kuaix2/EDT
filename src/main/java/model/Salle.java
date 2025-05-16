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

    //Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() { return numero;}
    public void setNumero(String numero) {this.numero = numero;}

    public int getCapacite() {return capacite;}
    public void setCapacite(int capacite) {this.capacite = capacite;}

    public String getEquipement() {return equipement;}
    public void setEquipement(String equipement) {this.equipement = equipement;}

    //Method
    public void afficherEmploi() {
        System.out.println("Emploi du temps de la salle " + numero);
        // TODO: implement display logic
    }
}
