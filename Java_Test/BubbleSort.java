package poly.sort;

public class BubbleSort implements Sort{

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void ascending(int[] a) {
        System.out.println("BubbleSort ascending");
    }

    @Override
    public void descending(int[] a) {
        System.out.println("Bubble descending");
    }

    @Override
    public void description() {
        System.out.println("숫자를 정렬하는 알고리즘입니다.");
        System.out.println("BubbleSort 입니다.");
    }
}
