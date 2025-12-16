interface Figure {
    double getArea();
    double getPerimeter();
    String getColor();
    String getBorder();

    default void show() {
        System.out.println("Площадь: " + String.format("%.2f", getArea()));
        System.out.println("Периметр: " + String.format("%.2f", getPerimeter()));
        System.out.println("Цвет внутри: " + getColor());
        System.out.println("Цвет линии: " + getBorder());
        System.out.println("---");
    }
}

class Circle implements Figure {
    double r;
    String color;
    String border;

    Circle(double radius, String col, String bord) {
        r = radius;
        color = col;
        border = bord;
    }

    public double getArea() {
        return Math.PI * r * r;
    }

    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    public String getColor() {
        return color;
    }

    public String getBorder() {
        return border;
    }
}

class Rectangle implements Figure {
    double width;
    double height;
    String color;
    String border;

    Rectangle(double w, double h, String col, String bord) {
        width = w;
        height = h;
        color = col;
        border = bord;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public String getColor() {
        return color;
    }

    public String getBorder() {
        return border;
    }
}

class Triangle implements Figure {
    double a;
    double b;
    double c;
    String color;
    String border;

    Triangle(double side1, double side2, double side3, String col, String bord) {
        a = side1;
        b = side2;
        c = side3;
        color = col;
        border = bord;
    }

    public double getArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public String getColor() {
        return color;
    }

    public String getBorder() {
        return border;
    }
}

public class task_2_4_2 {
    public static void main(String[] args) {
        System.out.println("Фигуры");

        Circle circle = new Circle(5, "Красный", "Черный");
        Rectangle rect = new Rectangle(4, 6, "Синий", "Белый");
        Triangle triangle = new Triangle(3, 4, 5, "Зеленый", "Желтый");

        System.out.println("Круг:");
        circle.show();

        System.out.println("Прямоугольник:");
        rect.show();

        System.out.println("Треугольник:");
        triangle.show();
    }
}