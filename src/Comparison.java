import java.util.Scanner;

public class Comparison {

    // Метод для сравнения двух чисел
    public static String compare(int a, int b) {
        if (a > b) {
            return a + " больше " + b;
        } else if (a < b) {
            return a + " меньше " + b;
        } else {
            return "Числа равны";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNum = sc.nextInt();

        System.out.print("Введите второе число: ");
        int secondNum = sc.nextInt();

        String result = compare(firstNum, secondNum);
        System.out.println(result);

        sc.close();
    }
}