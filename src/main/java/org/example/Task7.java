package org.example;

public class Task7 {
    public static void main(String[] args) {
        int firstFriday = 7;
        for (; firstFriday < 31; firstFriday = firstFriday + 7) {
            System.out.println("Сегодня пятница - "+firstFriday+" нужно подготовить отчет");
        }
    }
}
