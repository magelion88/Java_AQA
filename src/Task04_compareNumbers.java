public class Task04_compareNumbers {
    /* 3. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
     Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах
      от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
     */
    public static void main(String[] args) {
        compareNumbers();
    }
        public static void compareNumbers() {
            int a = 3;
            int b = 6;

            if (a >= b) {
                System.out.println("a >= b”");
            } else {
                System.out.println("a < b");
            }
        }
    }
