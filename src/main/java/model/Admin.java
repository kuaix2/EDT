package model;

public class Admin extends Utilisateur {
    private int id;

    //Constructor
    public Admin(int id, String nom, String prenom, String email, String mdp) {
        super(id, nom, prenom, email, mdp);
        this.id = id;
    }

    //Getter et Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    //Method
    public void modifierEmplois() {
        System.out.println("L'administrateur modifie un emploi du temps.");
        // TODO: implement
    }

    public void affecteEnseignant() {
        System.out.println("L'administrateur affecte un enseignant.");
        // TODO: implement
    }

    public void gererSalle() {
        System.out.println("L'administrateur gère une salle.");
        // TODO: implement
    }

    public void suivreStat() {
        System.out.println("L'administrateur suit les statistiques.");
        // TODO: implement
    }
}
