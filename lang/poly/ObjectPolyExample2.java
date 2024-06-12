package lang.poly;

public class ObjectPolyExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object= new Object();// Object 인스턴스로 만들 수 있다.

        Object[]  objects = {dog,car,object};
    }

    private static void size(Object[] objects) {
        System.out.println("전달의 객체의 수 : "+objects.length);
    }
}
