package org.example;
public class Personel {
    private String ad;
    private String soyad;
    private String dogumTarihi;

    public Personel(String ad, String soyad, String dogumTarihi) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumTarihi = dogumTarihi;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public int emeklilikYasi() {
        return 0;
    }
}
