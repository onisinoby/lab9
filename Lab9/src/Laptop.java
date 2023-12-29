public class Laptop implements Priceable {
    private String brand;
    private double price;

    public Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
