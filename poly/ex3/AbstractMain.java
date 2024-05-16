package poly.ex3;

public class AbstractMain {
    public static void main(String[] args) {

        // 추상 클래스 생성
        // animal animal1 = new animal(); 불가능함

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();
    }
}
