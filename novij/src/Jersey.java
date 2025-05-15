public class Jersey extends Product {
    String material;

    public Jersey(String size, String color, String material, double price) {
        super(size, color, price);
        this.material = material;
    }

    @Override
    public void displayInfo() {
        System.out.println("Jersey - Size: " + size + ", Color: " + color + ", Material: " + material + ", Price: €" + price);
    }
}