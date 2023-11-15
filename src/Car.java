public class Car implements Nameable, Priceable {
    String brand, model, color;
    int price;

    public Car(String brand, String model, String color, int price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public String getName() {
        return brand + " " + model;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
