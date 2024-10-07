package Lesson_3;

public class Dog extends Animal {
    private static int dogCount;

    public Dog(String name) {
        super(name, 500, 10);
        dogCount++;
    }

    public static void getDogCount() {
        System.out.println("Общее количество собак: " + dogCount);
    }
}
