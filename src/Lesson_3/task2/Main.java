package Lesson_3.task2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2, "Black", "White");
        Rectangle rectangle = new Rectangle(4, 5, "Red", "Yellow");
        Triangle triangle = new Triangle(4, 6, 7, "Black", "Green");

        infoAboutShapes(circle);
        infoAboutShapes(rectangle);
        infoAboutShapes(triangle);
    }

    public static void infoAboutShapes(Shape shape) {
        System.out.println("Информация о фигуре " + shape.getName() + "\n" +
                "Площадь: " + shape.infoArea() + "\n" +
                "Периметр: " + shape.infoPerimeter() + "\n" +
                "Цвет заливки: " + shape.infoFillColor() + "\n" +
                "Цвет границы: " + shape.infoBorderColor()
        );
    }
}

