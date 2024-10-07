package Lesson_3.task1;

public class Animal {
    String name;
    double maxRunLengthOfObstacle;
    double maxSwimLengthOfObstacle;
    static int countAnimal;

    public Animal(String name, double runLengthOfObstacle, double swimLengthOfObstacle) {
        this.name = name;
        this.maxRunLengthOfObstacle = runLengthOfObstacle;
        this.maxSwimLengthOfObstacle = swimLengthOfObstacle;
        countAnimal++;
    }

    public static void getCountAnimal(){
        System.out.println("Общее количество животных: " + countAnimal);
    }

   public void run(double lengthOfObstacle) {
        if (lengthOfObstacle <= maxRunLengthOfObstacle & lengthOfObstacle > 0) {
            System.out.println(name + " пробежал " + lengthOfObstacle + " м.");
        } else {
            System.out.println(name + " не может пробежать " + lengthOfObstacle + " м.");
        }
    }

    public void swim(double lengthOfObstacle) {
        if (lengthOfObstacle <= maxSwimLengthOfObstacle & lengthOfObstacle > 0) {
            System.out.println(name + " проплыл " + lengthOfObstacle + " м.");
        } else {
            System.out.println(name + " не может проплыть " + lengthOfObstacle + " м.");
        }

    }
}
