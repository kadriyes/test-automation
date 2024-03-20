package org.example;

public class Main {
    public static void main(String[] args) {
        Ayarlar ayarlar = new Ayarlar.Builder()
                .veritabaniUrl("jdbc:mysql://localhost:3306/veritabanim")
                .kullaniciAdi("kullanici")
                .sifre("sifre123")
                .build();

        System.out.println("Veritabanı URL: " + ayarlar.getVeritabaniUrl());
        System.out.println("Kullanıcı Adı: " + ayarlar.getKullaniciAdi());
        System.out.println("Şifre: " + ayarlar.getSifre());
    }
}
