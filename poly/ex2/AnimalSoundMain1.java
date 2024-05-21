package poly.ex2;

public class AnimalSoundMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    public static void soundAnimal(Animal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}

/*
위 코드의 핵심은 Animal animal 부분이다
    - 다형적 참조 덕분에 animal 변수는 자식인 dog, cat caw의 인스턴스를 참조할 수 있다
    - 메서드 오버라이딩 덕분에 animal.sound()를 호출해도 Dog.sound(), Cat.sound(), Caw.sound()와 같이 각 이스턴스의
      메서드를 호출할 수 있다.
 */