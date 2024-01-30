package org.example;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] metinDizisi = {"Metin1", "Metin2", "Deneme", "Kadriye", "Metin3", "Karakter"};

        Set<Character> benzersizKarakterler = karakterKumesiBul(metinDizisi, "Metin1", "Metin2");

        System.out.println("Benzersiz Karakter Kümesi: " + benzersizKarakterler);
    }

    public static Set<Character> karakterKumesiBul(String[] metinDizisi, String ilkKelime, String ikinciKelime) {
        Set<Character> karakterSetiIlkKelime = new HashSet<>();
        Set<Character> karakterSetiIkinciKelime = new HashSet<>();

        boolean ilkKelimeBulundu = false;
        boolean ikinciKelimeBulundu = false;

        for (String metin : metinDizisi) {
            for (char karakter : metin.toCharArray()) {
                if (!ilkKelimeBulundu) {
                    karakterSetiIlkKelime.add(karakter);
                    if (karakterSetiIlkKelime.size() == ilkKelime.length()) {
                        ilkKelimeBulundu = true;
                    }
                } else if (!ikinciKelimeBulundu) {
                    karakterSetiIkinciKelime.add(karakter);
                    if (karakterSetiIkinciKelime.size() == ikinciKelime.length()) {
                        ikinciKelimeBulundu = true;
                    }
                } else {
                    // İki kelimenin karakter seti bulundu, işlemi sonlandır
                    return birlestirKumeleri(karakterSetiIlkKelime, karakterSetiIkinciKelime);
                }
            }
        }

        // İki kelimenin karakter seti bulunamadı, boş küme döndür
        return new HashSet<>();
    }

    private static Set<Character> birlestirKumeleri(Set<Character> set1, Set<Character> set2) {
        Set<Character> birlesikKume = new HashSet<>(set1);
        birlesikKume.addAll(set2);
        return birlesikKume;
    }
}