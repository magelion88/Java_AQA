public class Task05_sumNum {
    /* 5. Напишите метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
     от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    public static void main(String[] args) {
        System.out.println("5 + 10 = " + sumNum(5, 10));
        System.out.println("50 + 5 = " + sumNum(50, 5));
    }
        public static boolean sumNum(int a, int b) {
            int sum;
            sum = a + b;
            return sum >= 10 && sum <=20;
        }
    }
