
package org.example.test;
import org.example.GenericSinif;
public class Main {
    public static void main(String[] args) {
        GenericSinif<String> stringOrnek = new GenericSinif<>("Hello World!");
        stringOrnek.veriyiYazdir();

        GenericSinif<Integer> integerOrnek = new GenericSinif<>(123);
        integerOrnek.veriyiYazdir();
    }
}

