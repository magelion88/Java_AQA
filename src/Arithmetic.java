import java.util.Scanner;

public class Arithmetic {

    public static int calculate(int a, int b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("Деление на ноль!");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Неизвестная операция: " + operator);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNum = sc.nextInt();

        System.out.print("Введите второе число: ");
        int secondNum = sc.nextInt();

        System.out.print("Введите арифметический знак (+, -, *, /): ");
        String sign = sc.next();

        try {
            int result = calculate(firstNum, secondNum, sign);
            System.out.println("Результат = " + result);
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        sc.close();
    }
}