package Task2_5;

import java.util.*;

class PhoneDirectory {
    private Map<String, List<String>> directory = new HashMap<>();

    public void add(String surname, String phoneNumber) {
        List<String> phones = directory.get(surname);
        if (phones == null) {
            phones = new ArrayList<>();
            directory.put(surname, phones);
        }
        phones.add(phoneNumber);
    }

    public List<String> get(String surname) {
        List<String> result = directory.get(surname);
        return result != null ? result : Collections.emptyList();
    }
}

public class PhoneDirectoryMain {
    public static void main(String[] args) {
        PhoneDirectory dir = new PhoneDirectory();

        // Добавляем записи
        dir.add("Иванов", "8-900-123-45-67");
        dir.add("Петров", "8-901-234-56-78");
        dir.add("Иванов", "8-902-345-67-89");
        dir.add("Сидоров", "8-903-456-78-90");
        dir.add("Петров", "8-904-567-89-01");

        // Ищем номера
        System.out.println("Иванов: " + dir.get("Иванов"));
        System.out.println("Петров: " + dir.get("Петров"));
        System.out.println("Сидоров: " + dir.get("Сидоров"));
        System.out.println("Кузнецов: " + dir.get("Кузнецов"));
    }
}