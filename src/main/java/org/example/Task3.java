package org.example;

public class Task3 {
    public static void main(String[] args) {
        double population = 12_000_000;
        double r = (double) 9 / 1000;
        for (int i = 0; i <= 10; i++) {
            population = population + population * r;
        }
        System.out.println("Население через 10 лет - "+population);

    }
}
