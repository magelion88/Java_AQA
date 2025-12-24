package Task2_5;

class MyArraySizeException extends Exception {
    MyArraySizeException(String s) { super(s); }
}

class MyArrayDataException extends Exception {
    MyArrayDataException(int i, int j, String value) {
        super("Ошибка в [" + i + "][" + j + "]: '" + value + "' - не цифра");
    }
}
public class Main {
    public static int checkArray(String[][] a) throws MyArraySizeException, MyArrayDataException {
        if (a.length != 4) throw new MyArraySizeException("Не 4 строки");
        for (String[] row : a) {
            if (row.length != 4) throw new MyArraySizeException("Не 4 столбца");
        }
        int sum = 0;

        for(int i = 0; i < 4; i++) {
           for(int j = 0; j < 4; j++) {
               try {
                   sum += Integer.parseInt(a[i][j]);
               }
               catch(NumberFormatException e) {
                   throw new MyArrayDataException(i, j, a[i][j]);
               }
           }
        }
        return sum;
    }

    public static void main(String[] args) throws MyArraySizeException {
        String[][] testArray = {
                {"10", "20", "30", "40"},
                {"50", "60", "70", "80"},
                {"90", "100", "110", "чеканная монета"},
                {"130", "140", "150", "160"}
    };
    try {
        int result = checkArray(testArray);
        System.out.println("Сумма: " + result);
    } catch (MyArraySizeException e) {
        System.out.println("Ошибка размера: " + e.getMessage());
    } catch (MyArrayDataException e) {
        System.out.println("Ошибка данных: " + e.getMessage());
    }
    }
}