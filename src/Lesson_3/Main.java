package Lesson_3;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik");
        Cat cat2 = new Cat("Debra");
        Cat cat3 = new Cat("Bob");
        Cat cat4 = new Cat("Mary");
        Cat cat5 = new Cat("Mam");

        cat1.run(201);
        cat1.swim(0);
        cat2.run(160);
        cat2.swim(1);

        Dog dog1 = new Dog("Bobik");
        Dog dog2 = new Dog("Mister");
        Dog dog3 = new Dog("Bob");

        dog1.run(501);
        dog1.swim(11);
        dog2.run(200);
        dog2.swim(8);

        System.out.println();

        Cat.getCatCount();
        Dog.getDogCount();
        Animal.getCountAnimal();

        // Продолжение задачи. Кормим котов
        System.out.println();

        Bowl bowl = new Bowl(20);
        Cat[] cats = {cat1, cat2, cat3, cat4, cat5};

        for (Cat cat : cats) {
            cat.feedCat(bowl, 7);
        }

        System.out.println("В миске осталось " + bowl.getFoodInBowl() + " еды.");

        bowl.addFoodInBowl(16);
        for (Cat cat : cats) {
            cat.feedCat(bowl, 7);
        }

        System.out.println("В миске осталось " + bowl.getFoodInBowl() + " еды.");
    }
}
