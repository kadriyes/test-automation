package org.example;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> sayilar = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(ElemanBulucu.elemanBul(sayilar, 4));  // 4 döndürür
        System.out.println(ElemanBulucu.elemanBul(sayilar, 7));  // -1 döndürür

        List<String> kelimeler = Arrays.asList("elma", "armut", "muz");
        System.out.println(ElemanBulucu.elemanBul(kelimeler, "muz"));  // muz döndürür
        System.out.println(ElemanBulucu.elemanBul(kelimeler, "kiraz"));  // -1 döndürür
    }
}
