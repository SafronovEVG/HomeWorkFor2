package org.example;

public class Task8 {
    public static void main(String[] args) {
        int sour = 0;
        int two = 200;
        do {
            sour = sour + 79;
            if (sour >= 2024 - two) {
                System.out.println("комета прилетела в " + sour);
            }
        } while (sour < 2024);
    }
}
