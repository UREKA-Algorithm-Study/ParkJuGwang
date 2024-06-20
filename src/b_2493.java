import java.io.*;
import java.util.*;

public class b_2493 {
    public static void main(String[] args)  throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Stack<int[]> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (stack.isEmpty()) {
                sb.append(0 + " ");
                stack.push(new int []{i , n});
            } else  {
                while (true) {
                    if (stack.peek()[1] < n) {
                        stack.pop();
                    } else if (stack.peek()[1] >= n) {
                        sb.append(stack.peek()[0] + " ");
                        stack.push(new int[]{i , n});
                        break;
                    }
                    if (stack.isEmpty()) {
                        sb.append(0 + " ");
                        stack.push(new int[]{i , n});
                        break;
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
