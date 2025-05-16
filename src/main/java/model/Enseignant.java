package model;

public class Enseignant extends Utilisateur {
    private int id;

    //Constructor
    public Enseignant(int id, String nom, String prenom, String email, String mdp) {
        super(id, nom, prenom, email, mdp);
        this.id = id;
    }

    //Getter et Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }


    //Method
    public void consulterEmplois() {
        System.out.println("L'enseignant consulte son emploi du temps.");
        // TODO: implement
    }

    public void notifierAdmin() {
        System.out.println("L'enseignant notifie l'admin.");
        // TODO: implement
    }
}
