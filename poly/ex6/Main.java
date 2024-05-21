package poly.ex6;

public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird();
        Dog dog = new Dog();
        Chicken chicken = new Chicken();

        bird.fly();
        dog.move();
        chicken.fly();

        soundAnimal(bird);
        soundAnimal(dog);
        soundAnimal(chicken);
    }

    private static void soundAnimal(AbstractAnimal animal){
        System.out.println("동물 울음소리 테스트 시작");
        animal.sound();
        System.out.println("동물 울음소리 테스트 종료");
        System.out.println();
    }
}
