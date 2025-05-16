package model;

import java.sql.Time;

public class Test_POJO {
    public static void main(String[] args) {
        // Test Admin
        Admin admin = new Admin(1, "Dupont", "Marie", "admin@email.com", "admin123");
        admin.modifierEmplois();

        // Test Enseignant
        Enseignant ens = new Enseignant(2, "Durand", "Paul", "ens@email.com", "pass123");
        ens.notifierAdmin();

        // Test Etudiant
        Etudiant etu = new Etudiant(3, "Martin", "Lucie", "etu@email.com", "mdp123");
        etu.consulterEmplois();

        // Test Salle
        Salle salle = new Salle(0, "", 0, "");
        salle.setId(101);
        salle.setNumero("B203");
        salle.setCapacite(30);
        salle.setEquipement("Projecteur");
        salle.afficherEmploi();

        // Test Notification
        Notif notif = new Notif(10, "Cours annulé", "Lucie Martin");
        notif.envoyerNotif();

        //Test Cours
        Cours cours = new Cours(1, "Maths", "CM", 90, Time.valueOf("09:00:00").toLocalTime(), Time.valueOf("10:30:00").toLocalTime());
        System.out.println(cours.getInfos());

        // Test EDT
        EDT edt = new EDT(1);
        edt.afficherEmploi();
    }
}

