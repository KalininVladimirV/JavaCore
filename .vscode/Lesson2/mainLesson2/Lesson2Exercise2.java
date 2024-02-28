package mainLesson2;
import java.util.Random;

public class Lesson2Exercise2 {
    Random random = new Random();
    int[] array = random.ints(10, 0, 10).toArray();

    private int sum(int[] array){
        int sum = 0;
        int arrayLength = array.length;
        int position = 0;
        if (position < arrayLength){
            sum = array[position] + sum(array);
            position++;
        }
        return sum;
    }

    int result = sum(array);

    public static void run() {
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

    }
