package org.example;

public class Gezegen {
    private String isim;
    private int siralamaNumarasi;
    private double uzaklik;
    private double yaricap;
    private double donmeSuresi;

    // Gezegen sınıfının kurucu metodu
    public Gezegen(String isim, int siralamaNumarasi, double uzaklik, double yaricap, double donmeSuresi) {
        this.isim = isim;
        this.siralamaNumarasi = siralamaNumarasi;
        this.uzaklik = uzaklik;
        this.yaricap = yaricap;
        this.donmeSuresi = donmeSuresi;
    }

    // Getter ve setter metotları
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getSiralamaNumarasi() {
        return siralamaNumarasi;
    }

    public void setSiralamaNumarasi(int siralamaNumarasi) {
        this.siralamaNumarasi = siralamaNumarasi;
    }

    public double getUzaklik() {
        return uzaklik;
    }

    public void setUzaklik(double uzaklik) {
        this.uzaklik = uzaklik;
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

    public double getDonmeSuresi() {
        return donmeSuresi;
    }

    public void setDonmeSuresi(double donmeSuresi) {
        this.donmeSuresi = donmeSuresi;
    }

    // toString metodu, nesnenin özelliklerini yazdırmak için kullanılır
    @Override
    public String toString() {
        return "Gezegen{" +
                "isim='" + isim + '\'' +  ", siralamaNumarasi=" + siralamaNumarasi + ", uzaklik=" + uzaklik + ", yaricap=" + yaricap + ", donmeSuresi=" + donmeSuresi + '}';
    }

    // Main metodu, programın başlangıç noktası
    public static void main(String[] args) {
        // Gezegen nesneleri oluşturuluyor
        Gezegen gezegen1 = new Gezegen("Merkür", 1, 0.39, 2439.7, 58.6);
        Gezegen gezegen2 = new Gezegen("Venüs", 2, 0.72, 6051.8, 243.0);
        Gezegen gezegen3 = new Gezegen("Dünya", 3, 1.0, 6371.0, 24.0);
        Gezegen gezegen4 = new Gezegen("Mars", 4, 1.52, 3389.5, 24.7);

        // Gezegen nesnelerinin bilgileri yazdırılıyor
        System.out.println(gezegen1);
        System.out.println(gezegen2);
        System.out.println(gezegen3);
        System.out.println(gezegen4);
    }
}