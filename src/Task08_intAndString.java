public class Task08_intAndString {
    /* 8. Напишите метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
     указанную строку, указанное количество раз;
     */
    public static void main(String[] args) {
        intAndString("i love Java", 5);
    }

    public static void intAndString(String text, int count) {
        if (count <= 0) {
            System.out.println("Цифра должна быть больше 0");
            return;
        }
        System.out.println(text);
        for (int i = 0; count > i; i++) {
            System.out.println(text);
        }
    }

}