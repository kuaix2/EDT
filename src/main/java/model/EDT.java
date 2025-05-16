package model;

public class EDT {
    private int id;

    //Constrctor
    public EDT(int id) {
        this.id = id;
    }

    //Setter et Getter
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    //Method
    public void afficherEmploi() {
        System.out.println("Affichage de l'emploi du temps pour l'ID: " + id);
        // TODO: implement real display logic here (e.g., print list of Cours)
    }
}
