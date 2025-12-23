package Task2_5;

class MyArraySizeException extends Exception {
    MyArraySizeException(String s) { super(s); }
}

public class Main {
    public static void checkArray(String[][] a) throws MyArraySizeException {
        if (a.length != 4) throw new MyArraySizeException("Не 4 строки");
        for (String[] row : a) {
            if (row.length != 4) throw new MyArraySizeException("Не 4 столбца");
        }
    }

    public static void main(String[] args) throws MyArraySizeException {
        String[][] test = new String[4][4];
        checkArray(test);
        System.out.println("OK");
    }
}