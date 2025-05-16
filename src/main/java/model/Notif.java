package model;

public class Notif {
    private int id;
    private String contenu;
    private String destinataire;


    //Constructor
    public Notif(int id, String contenu, String destinataire) {
        this.id = id;
        this.contenu = contenu;
        this.destinataire = destinataire;
    }

    //Getter et Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getContenu() { return contenu; }
    public void setContenu(String contenu) { this.contenu = contenu; }
    public String getDestinataire() { return destinataire; }
    public void setDestinataire(String destinataire) { this.destinataire = destinataire; }

    //Method
    public void envoyerNotif() {
        System.out.println("Envoi de la notification à " + destinataire + " : " + contenu);
        // TODO: implement
    }


}
