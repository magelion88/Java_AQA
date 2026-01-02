import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNum = sc.nextInt();

        System.out.print("Введите второе число: ");
        int secondNum = sc.nextInt();

        System.out.print("Введите арифметический знак: ");
        String sign = sc.next();

        int result = 0;


        switch (sign) {
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "/":
                result = firstNum / secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            default:
            System.out.println("Неизвестная операция");
            return;
        }

        System.out.println("Результат = " + result);
        sc.close();
    }
}
