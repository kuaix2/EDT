package model;

import java.time.LocalTime;

public class Cours {
    private int id;
    private String nom;
    private String type;
    private int duree;
    private LocalTime heureDebut;
    private LocalTime heureFin;

    //Constructor
    public Cours(int id, String nom, String type, int duree, LocalTime heureDebut, LocalTime heureFin) {
        this.id = id;
        this.nom = nom;
        this.type = type;
        this.duree = duree;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
    }

    //Setter et getter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public int getDuree() { return duree; }
    public void setDuree(int duree) { this.duree = duree; }

    public LocalTime getHeureDebut() { return heureDebut; }
    public void setHeureDebut(LocalTime heureDebut) { this.heureDebut = heureDebut; }

    public LocalTime getHeureFin() { return heureFin; }
    public void setHeureFin(LocalTime heureFin) { this.heureFin = heureFin; }

    //Method
    public String getInfos() {
        return nom + " - " + type + " (" + heureDebut + " to " + heureFin + ")";
    }
}
