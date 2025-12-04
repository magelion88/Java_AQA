public class Task02_checkSumSign {
    /* 2. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте
     их любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма
     больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае -
     “Сумма отрицательная”;
     */
    public static void main(String[] args) {
        checkSumSign();
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 10;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}