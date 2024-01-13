package org.example;

public class Task4 {
    public static void main(String[] args) {
        double contribution = 15000;
        int month =0;
        double saving = 0;
        while (saving < 12_000_000) {
            month++;
            saving = saving*1.07;
            saving = saving+ contribution;
        }
        System.out.println(month+" Месяцев");
    }
}
