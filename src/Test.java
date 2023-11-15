import java.lang.*;

public class Test {
    public static void main(String[] args) {

        Car car = new Car("Ferrari", "SF90-Stradale", "grey", 511250);
        Book book = new Book("Оскар Уйальд", "Веер леди Уиндермир", 725);

        System.out.println(car.getName());
        System.out.println(car.getPrice());
        System.out.println(book.getName());
        System.out.println(book.getPrice());

    }
}