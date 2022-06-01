package ua.com.javarush.kkushka.ave2.BruteForce;

import static ua.com.javarush.kkushka.ave2.Coder.Coder.coder;
import static ua.com.javarush.kkushka.ave2.alphabet.Alphabet.alphabet;

public class BruteForce {


    public static final String bruteForce(String message) {
        int key = 1;
        String decrypedText = "";
        while (key < alphabet.length()) {
            decrypedText +=  "ключ " + key + "  - " + coder(message, key) ;
            key += 1;
        }

        return decrypedText;
    }

}



