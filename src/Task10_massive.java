import java.lang.reflect.Array;
import java.util.Arrays;

public class Task10_massive {
    /* 10. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static void main(String[] args) {
        massive();
    }

    public static void massive() {
        int[] myArray = {1, 0, 1, 0, 0};

        System.out.println("До: " + Arrays.toString(myArray));

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 0) {
                myArray[i] = 1;
            } else
                myArray[i] = 0;
        }

        System.out.println("После: " + Arrays.toString(myArray));
    }
        }
