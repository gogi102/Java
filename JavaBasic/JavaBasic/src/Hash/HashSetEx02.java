package Hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] numbers = new int[x];
        for (int i = 0; i < x; i++) {
            numbers[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i + 1; i < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        System.out.println(set);
        System.out.println(set.toString());
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next() + "");
        }
        int[] newNums = set.stream().sorted().mapToInt(Integer::intValue).toArray();
        for (int n : newNums){
            System.out.println(n + "");
        }

    }
}