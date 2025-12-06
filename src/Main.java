import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printThreeWords();          // 1 task
        checkSumSign();             // 2 task
        printColor();               // 3 task
        compareNumbers();           // 4 task
        System.out.println("5 + 10 = " + sumNum(5, 10)); // 5 task
        posOrNeg(0);             // 6 task
        System.out.println(positiveOrNegative(0)); // 7 task
        intAndString("i love Java", 5); // 8 task
        System.out.println(leapYear(2023));
        massive();
        System.out.println(Arrays.toString(createAndFillArray()));
        matrix(3);
    }

    public static void printThreeWords() {
        String[] fruits = {"Orange", "Banana", "Apple"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
    public static void checkSumSign() {
        int a = 5;
        int b = 10;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = 3;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers() {
        int a = 3;
        int b = 6;

        if (a >= b) {
            System.out.println("a >= b”");
        } else {
            System.out.println("a < b");
        }
    }
    public static boolean sumNum(int a, int b) {
        int sum;
        sum = a + b;
        return sum >= 10 && sum <=20;
    }
    public static void posOrNeg(int a) {
        if (a >= 0)
            System.out.println("Число положительное");
        else
            System.out.println("Число отрицательное");

    }
    public static boolean positiveOrNegative(int a) {
        return a < 0;
    }
    public static void intAndString(String text, int count) {
        if (count <= 0) {
            System.out.println("Цифра должна быть больше 0");
            return;
        }
        System.out.println(text);
        for (int i = 0; count > i; i++) {
            System.out.println(text);
        }
    }
    public static boolean leapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && year % 100 != 0);
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

    public static int[] createAndFillArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static int [] matrix(int size) {

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            matrix[i][size - 1 - i] = 1;
        }
        System.out.println("Матрица c " + size + " диагоналями:");
        for (int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        return new int[0];
    }

}
