package generics.ex1;

public class BoxMain {
    public static void main(String[] args) {

        Box<String, Integer> box1 = new Box<>("Apple", 10);
        box1.displayItems();

        Box<Double, Character> box2 = new Box<>(3.14, 'A');
        box2.displayItems();
    }
}
