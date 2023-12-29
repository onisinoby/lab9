public class Phone implements Priceable {
    private String brand;
    private double price;

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
