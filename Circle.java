// Створюємо клас Circle (Круг).
// Він успадковує спільні можливості класу Figure.
public class Circle extends Figure {

    // Зберігаємо радіус круга.
    private double radius;

    // Конструктор отримує радіус при створенні круга.
    public Circle(double radius) {

        // Запам'ятовуємо радіус у нашому об'єкті.
        this.radius = radius;
    }

    // Реалізуємо метод обчислення площі з класу Figure.
    @Override
    public double calculateArea() {

        // Площа круга = число Пі * радіус * радіус.
        return Math.PI * radius * radius;
    }
}
