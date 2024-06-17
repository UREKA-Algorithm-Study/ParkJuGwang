import java.util.Scanner;

public class b_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = N;

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            boolean[] bool = new boolean[26];

            for (int j = 0; j < str.length() - 1; j++) {
                if (str.charAt(j) != str.charAt(j + 1)) {
                    if (bool[str.charAt(j + 1) - 97]) {
                        cnt--;
                        break;
                    }
                }
                bool[str.charAt(j) - 97] = true;
            }
        }

        sc.close();

        System.out.println(cnt);
    }

}
