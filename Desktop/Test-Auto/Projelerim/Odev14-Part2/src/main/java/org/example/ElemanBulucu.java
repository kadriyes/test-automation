package org.example;
import java.util.Collection;
import java.util.Optional;

public class ElemanBulucu {
    public static Object elemanBul(Collection<?> koleksiyon, Object arananEleman) {
        return koleksiyon.stream()
                .filter(eleman -> eleman.equals(arananEleman))
                .findFirst()
                .orElse(null); // Bulunamazsa null döndür
    }
}

