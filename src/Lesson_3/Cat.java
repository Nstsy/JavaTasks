package Lesson_3;

public class Cat extends Animal {
    private static int catCount = 0;
    private boolean isCatFull = false;

    public Cat(String name) {
        super(name, 200, 0);
        catCount++;
    }

    public static void getCatCount() {
        System.out.println("Общее количество котов: " + catCount);
    }

    public void feedCat(Bowl bowl, int needFood) {
        if (isCatFull) {
            System.out.println("Кот " + name + " сыт");
            return;
        }

        if (bowl.tryToEat(needFood)) {
            isCatFull = true;
            System.out.println("Кот " + name + " наелся");
        } else {
            System.out.println("Кот " + name + " голоден");
        }

    }
}
