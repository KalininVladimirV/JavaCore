package Lesson1;

import java.util.Random;

public class Lesson1Exercise4 {
    public static void run() {
    Random rand = new Random();
    // Определяем случайные размеры для двух массивов
    int sizeArray1 = rand.nextInt(30) + 1; // размер от 1 до 20
    int sizeArray2 = rand.nextInt(30) + 1; // размер от 1 до 20

    // Создаем два массива целых чисел с этими размерами
    int[] array1 = new int[sizeArray1];
    int[] array2 = new int[sizeArray2];

    // Заполняем массивы случайными числами от 0 до 29
    for(int i = 0;i<sizeArray1;i++)
    {
        array1[i] = rand.nextInt(30); // числа от 0 до 29
    }

    for(int i = 0;i<sizeArray2;i++)
    {
        array2[i] = rand.nextInt(30); // числа от 0 до 29
    }

    // Подсчитаем уникальные элементы для определения размеров результирующих массивов
    int uniqueCount1 = 0;
    int uniqueCount2 = 0;

    // Проверяем уникальность элементов первого массива
    for (int i = 0; i < array1.length; i++) {
        boolean isUnique = true;
        for (int j = 0; j < array2.length; j++) {
            if (array1[i] == array2[j]) {
                isUnique = false;
                break;
            }
        }
        if (isUnique) {
            uniqueCount1++;
        }
    }

    // Проверяем уникальность элементов второго массива
    for (int i = 0; i < array2.length; i++) {
        boolean isUnique = true;
        for (int j = 0; j < array1.length; j++) {
            if (array2[i] == array1[j]) {
                isUnique = false;
                break;
            }
        }
        if (isUnique) {
            uniqueCount2++;
        }
    }

    // Создаем двумерный массив для хранения уникальных элементов
    int[][] uniqueElements = new int[2][];
    uniqueElements[0] = new int[uniqueCount1];
    uniqueElements[1] = new int[uniqueCount2];

    // Заполняем массив уникальными элементами
    int index1 = 0;
    for (int i = 0; i < array1.length; i++) {
        boolean isUnique = true;
        for (int j = 0; j < array2.length; j++) {
            if (array1[i] == array2[j]) {
                isUnique = false;
                break;
            }
        }
        if (isUnique) {
            uniqueElements[0][index1++] = array1[i];
        }
    }

    int index2 = 0;
    for (int i = 0; i < array2.length; i++) {
        boolean isUnique = true;
        for (int j = 0; j < array1.length; j++) {
            if (array2[i] == array1[j]) {
                isUnique = false;
                break;
            }
        }
        if (isUnique) {
            uniqueElements[1][index2++] = array2[i];
        }
    }

    // Выводим результат
        System.out.println("Первый массив:");
        for (int numbers : array1) {
            System.out.print(numbers + " ");
        }
        System.out.println("\nВторой массив:");
        for (int numbers : array2) {
            System.out.print(numbers + " ");
        }
        System.out.println("\nУникальные элементы первого массива:");
        for (int numbers : uniqueElements[0]) {
            System.out.print(numbers + " ");
        }
        System.out.println("\nУникальные элементы второго массива:");
        for (int numbers : uniqueElements[1]) {
            System.out.print(numbers + " ");
        }
    }
    }
    

