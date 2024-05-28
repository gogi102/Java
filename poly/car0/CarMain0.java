package poly.car0;

public class CarMain0 {
    public static void main(String[] args) {

        Driver driver = new Driver();
        K3car k3car = new K3car();

        driver.setK3car(k3car);
        driver.drive();

        Model3car model3car = new Model3car();
        driver.setK3car(null);
        driver.setModel3car(model3car);
        driver.drive();
    }
}
