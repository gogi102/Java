package lang.object.tostring;

public class Car {

    private String carName;

    public Car(String carName) {
        this.carName = carName;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                '}';
    }

    public String carInfo(){
        return "Car{" +
                "carName='" + carName + '\'' +
                '}';
    }
}
