package lang.object.tostring;

public class ToStringName2 {

    public static void main(String[] args) {
        Car car = new Car("ModelY");
        Dog dog = new Dog("멍멍이", 2);
        Dog dog2 = new Dog("멍멍2", 5);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog);
        ObjectPrinter.print(dog2);
    }
}
