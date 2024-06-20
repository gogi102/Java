package lang.string.ex;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int[] countA = getAlphabetCnt(a);
        int[] cointB = getAlphabetCnt(b);

        int ans = 0;
        for (int i = 0; i < 26; i++) {
            ans += Math.abs(countA[i] - cointB[i]);
        }
        System.out.println(ans);
    }
    public static int[] getAlphabetCnt(String str){
        int[] alphabetCnt = new int[26];
        for (int i = 0; i < str.length(); i++) {
            alphabetCnt[str.charAt(i)-'a']++;
        }
        return alphabetCnt;
    }
}
