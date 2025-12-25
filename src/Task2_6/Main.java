package Task2_6;

import java.util.*;

class Student {
    String name;
    String group;  // ← ДОБАВИЛИ ГРУППУ
    int course;
    List<Integer> grades = new ArrayList<>();

    Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
    }

    void addGrade(int grade) {
        grades.add(grade);
    }

    double getAverage() {
        if (grades.isEmpty()) return 0;
        double sum = 0;
        for (int g : grades) {
            sum += g;
        }
        return sum / grades.size();
    }

    void nextCourse() {
        course++;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student s1 = new Student("Иван", "AQA5_25", 1);
        s1.addGrade(5); s1.addGrade(4); s1.addGrade(3);

        Student s2 = new Student("Петр", "AQA5_25", 2);
        s2.addGrade(2); s2.addGrade(2); s2.addGrade(3);

        Student s3 = new Student("Мария", "AQA5_25", 1);
        s3.addGrade(5); s3.addGrade(5); s3.addGrade(5);

        Student s4 = new Student("Анна", "AQA5_25", 3);
        s4.addGrade(3); s4.addGrade(4); s4.addGrade(3);

        // Добавляем в коллекцию
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        System.out.println("Все студенты:");
        for (Student s : students) {
            System.out.println(s.name + " - " + s.group +
                    ", курс " + s.course +
                    ", средний: " + s.getAverage());
        }

        System.out.println("\n1. Удаляем неуспевающих (средний < 3):");
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.getAverage() < 3.0) {
                System.out.println("  Отчислен: " + s.name + " из " + s.group);
                it.remove();
            }
        }

        System.out.println("\n2. Переводим на следующий курс (средний >= 3):");
        for (Student s : students) {
            if (s.getAverage() >= 3.0) {
                System.out.println("  Переведен: " + s.name +
                        " с " + s.course + " курса (" + s.group + ")");
                s.nextCourse();
            }
        }

        System.out.println("\n3. Студенты 2 курса:");
        printStudents(students, 2);
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student s : students) {
            if (s.course == course) {
                System.out.println(s.name + " - группа " + s.group);
            }
        }
    }
}