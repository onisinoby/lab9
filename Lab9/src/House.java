public class House implements Priceable {
    private String location;
    private double price;

    public House(String location, double price) {
        this.location = location;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
