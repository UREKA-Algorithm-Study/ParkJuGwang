import java.util.HashMap;
import java.util.Scanner;

public class b_2002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> map = new HashMap<>();
        int N = sc.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            map.put(sc.next(), i);
        }

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            String input = sc.next();
            arr[i] = map.get(input);
        }

        for(int i = 0; i< N-1; i++){
            for(int j = i+1; j< N; j++){
                if(arr[i] > arr[j]){
                    count += 1;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}

