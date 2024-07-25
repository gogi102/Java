package generics.ex2;

public class ManagerMain {
    public static void main(String[] args) {
        User user = new User("John Doe");
        Product product = new Product("Laptop", 1500);

        Manager<User, Product> manager = new Manager<>(user, product);
        manager.displayInfo();
    }
}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
