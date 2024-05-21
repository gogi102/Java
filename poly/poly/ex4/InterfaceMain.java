package poly.ex4;

public class InterfaceMain {
    public static void main(String[] args) {

        // 인터페이스 생성 불가
        // InterfaceAnimal animal = new InterfaceAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    private static void soundAnimal(InterfaceAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
// 앞서 설명한 순수 추상 클래스 예제와 거의 유사하다
// 순수 추상 클래스가 인터페이스가 되었을 뿐이다.