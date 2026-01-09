import java.util.Scanner;

public class TriangleArea {

    public static double calculateArea(int base, int height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Основание и высота должны быть положительными");
        }
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите основание треугольника: ");
        int base = sc.nextInt();

        System.out.print("Введите высоту треугольника: ");
        int height = sc.nextInt();

        System.out.println("Площадь треугольника = " + (0.5 * base * height));
        sc.close();
    }
}