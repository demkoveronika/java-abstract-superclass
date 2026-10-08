// Головний клас, з якого запускається наша програма.
public class Main {

    // Метод main - точка входу в програму.
    // Саме з нього Java починає виконання коду.
    public static void main(String[] args) {

        // Створюємо квадрат зі стороною 5.
        Square square = new Square(5);

        // Обчислюємо та виводимо площу квадрата.
        System.out.println("Площа квадрата: "
                + square.calculateArea());

        // Створюємо прямокутник із шириною 4 та висотою 6.
        Rectangle rectangle = new Rectangle(4, 6);

        // Обчислюємо та виводимо площу прямокутника.
        System.out.println("Площа прямокутника: "
                + rectangle.calculateArea());

        // Створюємо круг із радіусом 3.
        Circle circle = new Circle(3);

        // Обчислюємо та виводимо площу круга.
        System.out.println("Площа круга: "
                + circle.calculateArea());
    }
}
