import java.util.Scanner;

public class b_2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 0;

        int start = 1;
        int end = 1;
        int sum = 1;

        while(start <= end){
            if(sum == N) cnt++;
            if(sum < N){
                sum += ++end;
            }
            else if(sum >= N){
                sum -= start++;
            }
        }
        System.out.println(cnt);
    }
}
