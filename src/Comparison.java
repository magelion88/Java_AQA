import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNum = sc.nextInt();

        System.out.print("Введите второе число: ");
        int secondNum = sc.nextInt();

       if (firstNum > secondNum) {
           System.out.println(firstNum + " больше " + secondNum);
       }
       else if (firstNum < secondNum) {
               System.out.println(firstNum + " меньше " + secondNum);
           }
       else {
               System.out.println("Числа равны");
           }
    sc.close();
    }
}
