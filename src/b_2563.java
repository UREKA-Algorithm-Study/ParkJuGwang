import java.util.Scanner;

public class b_2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int x = 0, y = 0, total = 0;

        boolean[][] paper = new boolean[101][101];

        for (int i = 0; i < N; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            for (int j = x; j < x + 10; j++) {
                for (int k = j; k < y + 10; k++) {
                    if (!paper[j][k]) {
                        paper[j][k] = true;
                        total++;
                    }
                }
            }
        }

        System.out.println(total);
    }
}
