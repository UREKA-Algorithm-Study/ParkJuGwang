import java.util.Scanner;

public class b_11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N + 1];
        arr[0] = 0;

        for (int i = 0; i < N; i++) {
            arr[i + 1] = arr[i] + sc.nextInt();
        }
//                5 4 3 2 1
        //2 4
        // arr[4] - arr[1]
        //  14 - 5
        //1 4
        // arr[4] = arr[0]
        // 14 - 0

//        arr { 0, 5 , 9, 12, 14, 15}

        for (int i = 0; i < M; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            System.out.println(arr[end] - arr[start - 1]);
        }
    }
}
