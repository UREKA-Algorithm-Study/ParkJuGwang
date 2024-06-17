import java.util.HashMap;
import java.util.Scanner;

public class b_2002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //HashMap key value 로 접근
        HashMap<String, Integer> map = new HashMap<>();

        // 몇개의 차가 들어가는지 입력 받음
        int N = sc.nextInt();
        // 출력할 추월 차의 대수 count
        int count = 0;
        // map HashMap 에 N 대 만큼 차의 번호와 그에 따른 키를 넣어줌
        // ex 1 2 3 4 5 6
        for (int i = 0; i < N; i++) {
            map.put(sc.next(), i);
        }
        //
        int[] arr = new int[N];

        // arr 에 map 의 key 를 이용하여 찾은 후 해당 value를 순서대로 넣어줌
        // ex 4 1 5 2 6 3
        for (int i = 0; i < N; i++) {
            String input = sc.next();
            arr[i] = map.get(input);
        }

        // 앞 값이 뒤 값보다 크면 count 추월 한 거기때문에 count를 1 올려주고 탐색용 for 문을 break
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] > arr[j]) {
                    count += 1;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}

