import java.util.Scanner;

public class TriangleArea {
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
