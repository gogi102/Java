package Hash;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        int [] arr = new int[N];
        for (int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        int targer = sc.nextInt();


        System.out.println(solution(arr,targer));
    }
    public static boolean solution(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : arr) {
            if (set.contains(target - i)) {
                return true;
            }
            set.add(i);
        }return false;
    }
}
