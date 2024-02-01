package org.example;public class Main {
    public static void main(String[] args) {
        Erkek teamLeadErkek = new Erkek("Kadriye", "Yener", "01/01/1988");
        Departman departman = new Departman(teamLeadErkek);

        Kadin personelKadin = new Kadin("Ada", "Yener", "01/01/1990");
        departman.addPersonel(personelKadin);

        departman.addAssignment("Proje X");

        System.out.println("Emeklilik Yaşı (Erkek): " + teamLeadErkek.emeklilikYasi());
        System.out.println("Emeklilik Yaşı (Kadın): " + personelKadin.emeklilikYasi());
    }
}