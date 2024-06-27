package lang;

import java.util.Arrays;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int[] B = new int[M];
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }

            Arrays.sort(A);
            Arrays.sort(B);

            int ans = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (B[j] < A[i]) {
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
