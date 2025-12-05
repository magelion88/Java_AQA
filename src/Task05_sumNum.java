public class Task05_sumNum {
    /* 3. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
     Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах
      от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
     */
    public static void main(String[] args) {
        sumNum(5, 10);
        sumNum(50, 5);
    }
        public static boolean sumNum(int a, int b) {
            int sum;
            sum = a + b;
            return sum >= 10 && sum <=20;
        }
    }
