package org.example;

public class Main {

    public static void main(String[] args) {
        int calismaGunSayisi = 31;
        double maas = hesaplaMaasi(calismaGunSayisi);
        System.out.println("Maaş: " + maas + " TL");
    }

    public static double hesaplaMaasi(int calismaGunSayisi) {
        double maas = calismaGunSayisi * 800;
        if (calismaGunSayisi > 25) {
            int ekstraGunSayisi = calismaGunSayisi - 25;
            double ekstraPrim = ekstraGunSayisi * 1000;
            maas += ekstraPrim;
        }

        return maas;
    }
}
