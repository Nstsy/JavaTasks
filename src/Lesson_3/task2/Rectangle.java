package Lesson_3.task2;

public class Rectangle implements Shape {
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;

    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
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
       return 2 * (width + height);
    }

    @Override
    public double infoArea() {
       return width * height;
    }

    public String getName() {
        return "Rectangle";
    }
}
