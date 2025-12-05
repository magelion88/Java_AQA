public class Task06_posOrNeg {
    /* 6. Напишите метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     */
    public static void main(String[] args) {
        posOrNeg(0);
        posOrNeg(-5);
    }

    public static void posOrNeg(int a) {
        if (a >= 0)
            System.out.println("Число положительное");
    else
            System.out.println("Число отрицательное");

    }
}