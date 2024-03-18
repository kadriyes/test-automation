package org.example;

public class GenericSinif<T> {
    private T veri;

    public GenericSinif(T veri) {
        this.veri = veri;
    }

    public void veriyiYazdir() {
        System.out.println("Veri: " + veri);
    }
}
