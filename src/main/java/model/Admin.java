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

    @Override
    public String toString() {
        return "ADMIN \n" +
                "id:" + id + "\n+" +
                "nom: " + nom + "\n";
    }
}
