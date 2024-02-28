package Lesson1;
import java.util.Scanner;

public class Lesson1Exercise1 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 1:");
        System.out.println("Введите трехзначное число:");
        int number = scanner.nextInt();
            int hundreds = number / 100;
            int tens = (number / 10) % 10;
            int units = number % 10;
        if (number > 500) {
           number = units * 100 + tens * 10 + hundreds;   
        } else {
           number = hundreds * 100 + units * 10 + tens;
        }
        System.out.println(number);
        System.out.println("Конец задания 1.");
    }
}