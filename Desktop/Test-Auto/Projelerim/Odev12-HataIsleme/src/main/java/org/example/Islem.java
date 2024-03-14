package org.example;
//import OzelHatalar.*;
import org.example.OzelHatalar.GecersizGirisHatasi;
import org.example.OzelHatalar.VeritabaniBaglantiHatasi;
import org.example.OzelHatalar.HesaplamaHatasi;
public class Islem {
    public static void islemiGerçekleştir(int giris, boolean dbBaglanti, boolean hesaplamaModu) throws GecersizGirisHatasi, VeritabaniBaglantiHatasi, HesaplamaHatasi {
        if (giris < 0) {
            throw new GecersizGirisHatasi("Giriş negatif olamaz.");
        }

        if (!dbBaglanti) {
            throw new VeritabaniBaglantiHatasi("Veritabanı bağlantısı başarısız.");
        }

        if (hesaplamaModu && giris > 100) {
            throw new HesaplamaHatasi("Giriş hesaplama için çok büyük.");
        }

        // İşlem kodları burada yer alabilir
        System.out.println("İşlem başarıyla gerçekleştirildi.");
    }
}

