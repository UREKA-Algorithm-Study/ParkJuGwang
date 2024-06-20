import java.util.Scanner;
import java.util.Stack;

public class b_2493 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();
        int N = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            if (stack.isEmpty()) {
                stack.push(n);
                sb.append(0).append(" ");
            } else {
                while (true) {
                    if (stack.isEmpty()) {
                        stack.push(n);
                        sb.append(0).append(" ");
                        break;
                    }

                    if (stack.peek() >= n) {

                    }else if (stack.peek() < n) {
                        stack.pop();
                    }
                }
            }
        }
    }
}
