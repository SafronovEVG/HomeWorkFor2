package org.example;

public class Task6 {
    public static void main(String[] args) {
        int mount = 0;
        double saving = 0;
        int contribution = 15000;
        while (mount <= 108) {
            mount++;
            saving=saving*1.07;
            saving=saving+contribution;
            if (mount % 6 == 0) {
                System.out.println("Месяц - "+mount+" Сумма накоплений - "+ saving);
            }
        }
    }
}
