package lr2.Example5;

public class Rectangle {
    private double length;
    private double width;

    // Конструктор класса Rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Методы для установки и получения длины
    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    // Методы для установки и получения ширины
    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    // Метод для вычисления площади
    public double getArea() {
        return length * width;
    }

    // Метод для вычисления периметра
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
