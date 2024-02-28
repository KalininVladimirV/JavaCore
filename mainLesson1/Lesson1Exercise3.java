package Lesson1;

import java.util.Scanner;

public class Lesson1Exercise3 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 1:");
        System.out.println("Введите вес следующего пассажира или введите 0, если нужно закрыть двери:");
        int numberOfPeople = 0;
        long number = 0;
        long maxNumber = 450;
        long nextMan = 0;
        do {
            nextMan = scanner.nextLong();
            if (nextMan == 0 ) {
                System.out.println("Вход в лифт закрыт, нажата кнопка закрытия лифта, в лифте находится " + numberOfPeople + " человек, общий вес " + number + " кг.");
                break;
            } else {
                numberOfPeople++;
                number = number + nextMan;
                if (numberOfPeople == 6 && number > maxNumber) {
                    System.out.println("Вход в лифт закрыт, в лифте находится максимальное количество людей, общий вес в лифте " + number + " кг., это превышает максимальное допустимое, кому-то надо выйти из лифта");
                    break;
                }
                if (numberOfPeople == 6 ) {
                    System.out.println("Вход в лифт закрыт, в лифте находится максимальное количество людей, общий вес в лифте " + number + " кг.");
                    break;
                }
                if (number > maxNumber) {
                    System.out.println("В лифте находится " + numberOfPeople + " человек.Вход в лифт закрыт, общий вес в лифте равен " + number + " кг, лифт не сможет уехать, кому-то надо выйти из лифта");
                    break;
                }
                System.out.println("В лифте находится " + numberOfPeople + " человек, общий вес " + number + " кг.Введите вес следующего пассажира или введите 0, если нужно закрыть двери");
            }
        } while (nextMan != 0 || number < maxNumber || numberOfPeople < 6);
        System.out.println("Конец задания 3.");
    }
}