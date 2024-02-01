package org.example;
public class Kadin extends Personel {
    public Kadin(String ad, String soyad, String dogumTarihi) {
        super(ad, soyad, dogumTarihi);
    }

    @Override
    public int emeklilikYasi() {
        return 60;
    }
}

