import java.util.Arrays;

public class Task11_array100 {
    /* 11. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
    значениями 1 2 3 4 5 6 7 8 ... 100;
     */
    public static void main(String[] args) {
        array();
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
