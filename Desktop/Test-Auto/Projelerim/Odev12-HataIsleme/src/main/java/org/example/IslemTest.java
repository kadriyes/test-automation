package org.example;
public class IslemTest {
    public static void main(String[] args) {
        try {
            Islem.islemiGerçekleştir(-1, true, false);
        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        }

        try {
            Islem.islemiGerçekleştir(10, false, true);
        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        }

        try {
            Islem.islemiGerçekleştir(101, true, true);
        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        }

        try {
            Islem.islemiGerçekleştir(50, true, false);
        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}
