public class Task01_printThreeWords {
    // 1. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple

    public static void main(String[] args) {
        printThreeWords();
    }

    public static void printThreeWords() {
        String[] fruits = {"Orange", "Banana", "Apple"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}