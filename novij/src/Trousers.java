public class Trousers extends Product {
    String type;

    public Trousers(String size, String color, String type, double price) {
        super(size, color, price);
        this.type = type;
    }

    @Override
    public void displayInfo() {
        System.out.println("Trousers - Size: " + size + ", Color: " + color + ", Type: " + type + ", Price: €" + price);
    }
}