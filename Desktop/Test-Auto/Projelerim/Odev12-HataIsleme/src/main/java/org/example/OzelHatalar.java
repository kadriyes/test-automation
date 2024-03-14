package org.example;

public class OzelHatalar {
    public static class GecersizGirisHatasi extends Exception {
        public GecersizGirisHatasi(String mesaj) {
            super(mesaj);
        }
    }

    public static class VeritabaniBaglantiHatasi extends Exception {
        public VeritabaniBaglantiHatasi(String mesaj) {
            super(mesaj);
        }
    }

    public static class HesaplamaHatasi extends Exception {
        public HesaplamaHatasi(String mesaj) {
            super(mesaj);
        }
    }
}

