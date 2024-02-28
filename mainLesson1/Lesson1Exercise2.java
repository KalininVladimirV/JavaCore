package Lesson1;
public class Lesson1Exercise2 {
    public static void run() {
        System.out.println("Задание 2:");
        for (int number = 190; number < 1000; number += 10) {
            int sum_of_odd_divisors = 0;
            int max_divisor = number / 2;
            for (int divisor = 1; divisor <= max_divisor; divisor += 2) {
                if (number % divisor == 0) {
                    sum_of_odd_divisors += divisor;
                }
            }
            if (sum_of_odd_divisors % 10 == 0) {
                System.out.println(number);
            }
        }
        System.out.println("Конец задания 2.");
}
}