public class Task07_positiveOrNegative {
    /* 7. Напишите метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    если число отрицательное, и вернуть false если положительное.
    Замечание: ноль считаем положительным числом.
     */
    public static void main(String[] args) {
        System.out.println(positiveOrNegative(0));
        System.out.println(positiveOrNegative(-1));
        System.out.println(positiveOrNegative(1));
    }

    public static boolean positiveOrNegative(int a) {
        return a < 0;

    }
}