package org.example;

public class VeritabaniBaglantisi {
    private static VeritabaniBaglantisi ornek;
    private String baglantiDizesi = "VarsayilanBaglantiDizesi";

    private VeritabaniBaglantisi() {
        // Özel kurucumetot
    }

    public static VeritabaniBaglantisi getOrnek() {
        if (ornek == null) {
            synchronized (VeritabaniBaglantisi.class) {
                if (ornek == null) {
                    ornek = new VeritabaniBaglantisi();
                }
            }
        }
        return ornek;
    }

    public String getBaglantiDizesi() {
        return baglantiDizesi;
    }

    public void setBaglantiDizesi(String yeniBaglantiDizesi) {
        this.baglantiDizesi = yeniBaglantiDizesi;
    }
}

