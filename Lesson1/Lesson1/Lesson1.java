package Lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        // Запуск всех заданий без проверки аргументов командной строки
        System.out.println("Запуск всех заданий:");
        System.out.println("Задание 1: Программа, принимающая трехзначное число и изменяющая его.");
        Lesson1Exercise1.run();
        System.out.println("Задание 2: Вывод всех трехзначных чисел, удовлетворяющих условиям.");
        Lesson1Exercise2.run();
        System.out.println("Задание 3: Подсчет людей и веса в лифте с ограничениями.");
        Lesson1Exercise3.run();
        System.out.println("Задание 4: Формирование массивов и нахождение уникальных элементов.");
        Lesson1Exercise4.run();
    }
}