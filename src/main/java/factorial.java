import java.util.Scanner;

public class factorial {
    public static long calculateFactorial(int n) {
        if(n < 0) {
            throw new IllegalArgumentException("введено отрицательное число");
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int n = sc.nextInt();

        try {
            long result = calculateFactorial(n);
            System.out.println("Факториал = " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        sc.close();
    }
}
