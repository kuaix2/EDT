package model;

public class Etudiant extends Utilisateur {
    private int id;

    //Constructor
    public Etudiant(int id, String nom, String prenom, String email, String mdp) {
        super(id, nom, prenom, email, mdp); // initialise Utilisateur
        this.id = id;
    }

    //Getter et Setter
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    //Method
    public void consulterEmplois() {
        System.out.println("L'étudiant consulte son emploi du temps.");
        // TODO: implémenter
    }

    public void voirSalleInfo() {
        System.out.println("L'étudiant consulte les infos de la salle.");
        // TODO: implémenter
    }
}
