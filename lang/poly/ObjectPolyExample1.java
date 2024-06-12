package lang.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog  dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);


    }

    private static void action(Object object) {
        // 부모는 자식 메서드를 참조할 수 없다.
        // dog.sound();  // 컴파일 오류 , Object 에서 sound를 찾기 때문에 에러가 난다.
        // car.move();  // 컴파일 오류, Object 에서 move를 찾기 때문에 에러가 난다.

        // 객체가 맞는 다운 캐스팅이 필요
        if (object instanceof Dog dog) {
            dog.sound();
        } else if (object instanceof Car c) {
            c.mvoe();
        }
    }
}
