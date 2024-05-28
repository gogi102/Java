package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {

        Driver driver = new Driver();

        Car k3car = new K3car();
        driver.setCar(k3car);
        driver.drive();

        Car model3car = new Model3car();
        driver.setCar(model3car);
        driver.drive();
    }
}
