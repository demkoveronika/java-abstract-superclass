// Створюємо клас Square (Квадрат).
// extends Figure означає, що Square успадковує клас Figure.
public class Square extends Figure {

    // Зберігаємо довжину сторони квадрата.
    private double side;

    // Конструктор отримує довжину сторони при створенні квадрата.
    public Square(double side) {

        // Зберігаємо отриману довжину сторони в нашому об'єкті.
        this.side = side;
    }

    // Беремо метод calculateArea з Figure
    // і прописуємо, як саме квадрат обчислює площу.
    @Override
    public double calculateArea() {

        // Площа квадрата = сторона * сторона.
        return side * side;
    }
}
