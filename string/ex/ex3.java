package lang.string.ex;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next().toUpperCase();
        int[] cnt = new int[26];

        for (int i = 0; i < str.length(); i++) {
            cnt[str.charAt(i)-'A']++;
        }

        int maxCnt = 0;
        char maxAlphabet = '?';

        for (int i = 0; i < 26; i++) {
            if (cnt[i] > maxCnt){
                maxCnt = cnt[i];
                maxAlphabet = (char)('A'+i);
            } else if (cnt[i] == maxCnt) {
                maxAlphabet = '?';
            }
        }
        System.out.println(maxAlphabet);
    }
}
