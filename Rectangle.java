// Створюємо клас Rectangle (Прямокутник).
// Він успадковує спільні можливості класу Figure.
public class Rectangle extends Figure {

    // Зберігаємо ширину та висоту прямокутника.
    private double width;
    private double height;

    // Конструктор отримує ширину та висоту.
    public Rectangle(double width, double height) {

        // Запам'ятовуємо отримані значення в об'єкті.
        this.width = width;
        this.height = height;
    }

    // Реалізуємо метод обчислення площі з класу Figure.
    @Override
    public double calculateArea() {

        // Площа прямокутника = ширина * висота.
        return width * height;
    }
}
