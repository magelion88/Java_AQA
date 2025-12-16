import java.util.ArrayList;
import java.util.List;

public class task_2_4_1 {
    public static void main(String[] args) {

        Dog dog = new Dog("Бобик");
        Cat cat = new Cat("Боня");

        dog.run(150);
        dog.run(600);
        dog.swim(5);
        dog.swim(15);

        cat.run(100);
        cat.run(250);
        cat.swim(5);

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Собак: " + Dog.getDogCount());
        System.out.println("Котов: " + Cat.getCatCount());

        Bowl bowl = new Bowl();
        bowl.addFood(50);

        Cat[] cats = {
                new Cat("Барсик"),
                new Cat("Васька"),
                new Cat("Рыжик"),
                new Cat("Черныш"),
                new Cat("Пушистик")
        };

        System.out.println("\nКоты кушают...");
        for (Cat c : cats) {
            c.eat(bowl);
        }

        System.out.println("\nСытость котов:");
        for (Cat c : cats) {
            System.out.println(c.getName() + " - " + (c.isFull() ? "сыт" : "голоден"));
        }

        System.out.println("\nОстаток еды в миске: " + bowl.getFoodAmount());

        System.out.println("\nДобавляем еды и кормим голодных котов...");
        bowl.addFood(30);

        for (Cat c : cats) {
            if (!c.isFull()) {
                c.eat(bowl);
            }
        }

        System.out.println("\nФинальное состояние:");
        for (Cat c : cats) {
            System.out.println(c.getName() + " - " + (c.isFull() ? "сыт" : "голоден"));
        }
        System.out.println("Остаток еды в миске: " + bowl.getFoodAmount());
    }
}

abstract class Animal {
    private String name;
    private static int animalCount = 0;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public String getName() {
        return name;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);

    public static int getAnimalCount() {
        return animalCount;
    }
}

class Dog extends Animal {
    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(getName() + " пробежал " + distance + " м.");
        } else {
            System.out.println(getName() + " не может пробежать " + distance + " м. (максимум " + MAX_RUN_DISTANCE + " м.)");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= MAX_SWIM_DISTANCE) {
            System.out.println(getName() + " проплыл " + distance + " м.");
        } else {
            System.out.println(getName() + " не может проплыть " + distance + " м. (максимум " + MAX_SWIM_DISTANCE + " м.)");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}

class Cat extends Animal {
    private static final int MAX_RUN_DISTANCE = 200;
    private static final int MAX_SWIM_DISTANCE = 0;
    private static int catCount = 0;

    private boolean isFull;
    private static final int FOOD_AMOUNT_NEEDED = 20;

    public Cat(String name) {
        super(name);
        this.isFull = false;
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(getName() + " пробежал " + distance + " м.");
        } else {
            System.out.println(getName() + " не может пробежать " + distance + " м. (максимум " + MAX_RUN_DISTANCE + " м.)");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(getName() + " не умеет плавать!");
    }

    public void eat(Bowl bowl) {
        if (isFull) {
            System.out.println(getName() + " уже сыт и не хочет есть.");
            return;
        }

        if (bowl.takeFood(FOOD_AMOUNT_NEEDED)) {
            isFull = true;
            System.out.println(getName() + " покушал и теперь сыт.");
        } else {
            System.out.println(getName() + " не может покушать, в миске недостаточно еды.");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public static int getCatCount() {
        return catCount;
    }

    public static int getFoodAmountNeeded() {
        return FOOD_AMOUNT_NEEDED;
    }
}

class Bowl {
    private int foodAmount;

    public Bowl() {
        this.foodAmount = 0;
    }

    public Bowl(int initialFood) {
        this.foodAmount = Math.max(initialFood, 0);
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("В миску добавлено " + amount + " единиц еды. Теперь в миске: " + foodAmount);
        }
    }

    public boolean takeFood(int amount) {
        if (amount <= foodAmount) {
            foodAmount -= amount;
            return true;
        }
        return false;
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}