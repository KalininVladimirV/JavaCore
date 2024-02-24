package Lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        // Проверяем, есть ли аргументы командной строки
        if (args.length > 0) {
            // Пытаемся преобразовать первый аргумент в число
            int taskNumber;
            try {
                taskNumber = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста, введите номер задания в виде числа.");
                return;
            }

            // Выбираем задание для запуска
            switch (taskNumber) {
                case 1:
                    System.out.println("Задание 1: Программа, принимающая трехзначное число и изменяющая его.");
                    Lesson1Exercise1.run();
                    break;
                case 2:
                    System.out.println("Задание 2: Вывод всех трехзначных чисел, удовлетворяющих условиям.");
                    Lesson1Exercise2.run();
                    break;
                case 3:
                    System.out.println("Задание 3: Подсчет людей и веса в лифте с ограничениями.");
                    Lesson1Exercise3.run();
                    break;
                case 4:
                    System.out.println("Задание 4: Формирование массивов и нахождение уникальных элементов.");
                    Lesson1Exercise4.run();
                    break;
                default:
                    System.out.println("Неверный номер задания. Доступны задания с 1 по 4.");
                    break;
            }
        } else {
            // Если аргументы не предоставлены, выводим описания и запускаем все задания
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
}