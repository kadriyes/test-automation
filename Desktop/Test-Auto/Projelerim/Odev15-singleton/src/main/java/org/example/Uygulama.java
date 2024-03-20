package org.example;

public class Uygulama {
    public static void main(String[] args) {
        VeritabaniBaglantisi baglanti1 = VeritabaniBaglantisi.getOrnek();
        VeritabaniBaglantisi baglanti2 = VeritabaniBaglantisi.getOrnek();

        System.out.println("Baglanti 1: " + baglanti1);
        System.out.println("Baglanti 2: " + baglanti2);

        baglanti1.setBaglantiDizesi("YeniBaglantiDizesi");
        System.out.println("Baglanti 1 Dizesi: " + baglanti1.getBaglantiDizesi());
        System.out.println("Baglanti 2 Dizesi: " + baglanti2.getBaglantiDizesi());

        // Baglanti 1 ve Baglanti 2 nin aynı nesneye referans verdiğini gösterme
        System.out.println("Baglanti 1 ve Baglanti 2 aynı nesneye mi referans veriyor? " + (baglanti1 == baglanti2));
    }
}
