public class Main {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth");
        Car bmw = new Car("BMW");
        Animal dog = new Animal("Dog");

        System.out.println(earth.getName()); // Output: Earth
        System.out.println(bmw.getName()); // Output: BMW
        System.out.println(dog.getName()); // Output: Dog
    }
}