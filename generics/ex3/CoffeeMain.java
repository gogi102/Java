package generics.ex3;

public class CoffeeMain {
        public static void main(String[] args) {
            Customer customer = new Customer("Alice");
            CoffeeOrder<Customer> order = new CoffeeOrder<>(customer, "Espresso");
            order.displayOrder();
        }
    }

class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
