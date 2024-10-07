package Lesson_3.task2;

public class Circle implements Shape {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }


    @Override
    public String infoFillColor() {
       return fillColor;
    }

    @Override
    public String infoBorderColor() {
        return borderColor;
    }

    @Override
    public double infoPerimeter() {
      return 2 * Math.PI * radius;
    }

    @Override
    public double infoArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
