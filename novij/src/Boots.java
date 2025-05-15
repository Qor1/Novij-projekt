public class Boots extends Product {
    String brand;

    public Boots(String size, String color, String brand, double price) {
        super(size, color, price);
        this.brand = brand;
    }

    @Override
    public void displayInfo() {
        System.out.println("Boots - Size: " + size + ", Color: " + color + ", Brand: " + brand + ", Price: €" + price);
    }
}