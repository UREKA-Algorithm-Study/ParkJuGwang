import java.util.Scanner;

public class b_5557 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        long[][] dp = new long[N - 1][21];

        dp[0][arr[0]] = 1;

        for (int i = 1; i < N - 1; i++) {
            int num  = arr[i];
            for (int j = 0; j < 21; j++) {
                if (dp[i - 1][j] != 0) { // 전 위치에서의 경우의 수가 존재
                    int plus = j + num;
                    if (plus < 21) {
                        dp[i][plus] += dp[i - 1][j];
                    }
                    int minus = j - num;
                    if (-1 < minus) {
                        dp[i][minus] += dp[i - 1][j];
                    }
                }
            }
        }

        System.out.println(dp[N - 2][arr[N - 1]]);
    }
}
