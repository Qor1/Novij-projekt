abstract class Product {
    String size;
    String color;
    double price;

    public Product(String size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public abstract void displayInfo();
}