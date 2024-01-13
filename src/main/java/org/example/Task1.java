package org.example;

public class Task1 {
    public static void main(String[] args) {
        int x = 0;
        int sum = 0;
        while (sum < 2_459_00) {
            x++;
            sum = sum+15000;
            System.out.println("Меся - "+ x + " , сумма накоплений - "+sum);
        }
    }
}