public class Book implements Nameable, Priceable {
    String auth, name;
    int price;

    public Book(String auth, String name, int price) {
        this.auth = auth;
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return auth + ": " +  name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
