public class Task09_leapYear {
    /* 9. Напишите метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
    не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    public static void main(String[] args) {
        System.out.println(leapYear(2024));
        System.out.println(leapYear(2023));
    }

    public static boolean leapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && year % 100 != 0);
    }

}