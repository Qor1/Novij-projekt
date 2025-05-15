import java.util.ArrayList;

public class Cart {
    ArrayList<Product> items = new ArrayList<>();

    public void addProduct(Product product) {
        items.add(product);
        System.out.println("Added to cart!");
    }

    public void showCart() {
        System.out.println("\n--- Your Cart ---");
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        double total = 0;
        for (Product p : items) {
            p.displayInfo();
            total += p.getPrice();
        }
        System.out.println("Total: €" + total);
    }

    public void checkout() {
        showCart();
        System.out.println("Thank you for your purchase!");
        items.clear();

    }
}