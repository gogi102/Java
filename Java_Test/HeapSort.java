package poly.sort;

public class HeapSort implements Sort{

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void ascending(int[] a) {
        System.out.println("HeapSort ascending");
    }

    @Override
    public void descending(int[] a) {
        System.out.println("HeapSort descending");
    }

    @Override
    public void description() {
        System.out.println("숫자를 정렬하는 알고리즘입니다.");
        System.out.println("HeapSort 입니다.");
    }
}
