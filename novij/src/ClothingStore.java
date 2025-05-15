import java.util.Scanner;

public class ClothingStore {
    Scanner scanner = new Scanner(System.in);
    Cart cart = new Cart();

    Boots[] boots = {
        new Boots("42", "Red", "Nike", 120),
        new Boots("43", "Black", "Adidas", 110)
    };

    Jersey[] jerseys = {
        new Jersey("M", "White", "Cotton", 30),
        new Jersey("L", "Black", "Polyester", 25)
    };

    Trousers[] trousers = {
        new Trousers("M", "Blue", "Jeans", 50),
        new Trousers("L", "Gray", "Cargo", 55)
    };

    public void showMenu(User user) {
        while (true) {
            System.out.println("\nChoose category:");
            System.out.println("1. Boots");
            System.out.println("2. Jerseys");
            System.out.println("3. Trousers");
            System.out.println("4. View Cart");
            System.out.println("5. Checkout & Exit");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    showProducts(boots);
                    break;
                case "2":
                    showProducts(jerseys);
                    break;
                case "3":
                    showProducts(trousers);
                    break;
                case "4":
                    cart.showCart();
                    break;
                case "5":
                    cart.checkout();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void showProducts(Product[] products) {
        System.out.println("\nAvailable Products:");
        for (int i = 0; i < products.length; i++) {
            System.out.print((i + 1) + ". ");
            products[i].displayInfo();
        }
        System.out.print("Select a product to add to cart (or 0 to go back): ");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice > 0 && choice <= products.length) {
            cart.addProduct(products[choice - 1]);
        }
    }
}