package poly.sort;

import java.util.Scanner;

public class SortTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Sort[] sorts = {new QuickSort(), new BubbleSort(), new HeapSort()};

        int[] nums = new int[5];

        System.out.println("정렬 방식을 선택하세요.");
        System.out.println("[1] : BubbleSort");
        System.out.println("[2] : HeapSort");
        System.out.println("[3] : QuickSort");

        int choice = sc.nextInt();

        if (choice == 1){
            selectedSort(nums,sorts[1]);
        } else if (choice == 2) {
            selectedSort(nums,sorts[2]);
        } else if (choice == 3) {
            selectedSort(nums,sorts[0]);
        } else {
            System.out.println("잘못된 선택 입니다");
        }

    }
    private static void selectedSort(int[] nums, Sort sort){
        sort.ascending(nums);
        sort.descending(nums);
        sort.description();
    }
}
