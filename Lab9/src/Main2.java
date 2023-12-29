public class Main2 {
    public static void main(String[] args) {
        Laptop dell = new Laptop("Dell", 999.99);
        House mansion = new House("Los Angeles", 1000000.0);
        Phone iphone = new Phone("iPhone", 999.0);

        System.out.println(dell.getPrice()); // Output: 999.99
        System.out.println(mansion.getPrice()); // Output: 1000000.0
        System.out.println(iphone.getPrice()); // Output: 999.0
    }
}
