package org.example;

public class Ayarlar {
    private final String veritabaniUrl;
    private final String kullaniciAdi;
    private final String sifre;

    private Ayarlar(Builder builder) {
        this.veritabaniUrl = builder.veritabaniUrl;
        this.kullaniciAdi = builder.kullaniciAdi;
        this.sifre = builder.sifre;
    }

    public String getVeritabaniUrl() {
        return veritabaniUrl;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public static class Builder {
        private String veritabaniUrl;
        private String kullaniciAdi;
        private String sifre;

        public Builder veritabaniUrl(String veritabaniUrl) {
            this.veritabaniUrl = veritabaniUrl;
            return this;
        }

        public Builder kullaniciAdi(String kullaniciAdi) {
            this.kullaniciAdi = kullaniciAdi;
            return this;
        }

        public Builder sifre(String sifre) {
            this.sifre = sifre;
            return this;
        }

        public Ayarlar build() {
            return new Ayarlar(this);
        }
    }
}
