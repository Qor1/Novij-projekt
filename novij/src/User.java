public class User {
    String name;
    String country;

    public User(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public void printInfo() {
        System.out.println("Welcome, " + name + " from " + country + "!");
    }
}