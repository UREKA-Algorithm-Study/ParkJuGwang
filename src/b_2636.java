import java.util.*;
import java.io.*;

public class b_2636 {
    static int N, M;
    static int[][] cheese;
    static boolean[][] visited;
    static int[] dr = {0, 0, -1, 1};
    static int[] dc = {-1, 1, 0, 0};
    static int t, count;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        cheese = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                cheese[i][j] = Integer.parseInt(st.nextToken());
                if (cheese[i][j] == 1) {
                    count++;  // 전체 치즈의 갯수 세기
                }
            }
        }

        bfs();
    }

    public static void bfs() {
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(0, 0));
        visited = new boolean[N][M];
        visited[0][0] = true;

        int melted = 0;
        t++;

        while (!q.isEmpty()) {
            Point p = q.poll();
            // nr nc 에 dx[i],dy[i] 를 더해 상하좌우 좌표를 구함
            for (int i = 0; i < 4; i++) {
                int nr = p.r + dr[i];
                int nc = p.c + dc[i];

                if (nr < 0 || nc < 0 || nr >= N || nc >= M || visited[nr][nc]) {
                    continue;
                }

                visited[nr][nc] = true;

                if (cheese[nr][nc] == 0) {
                    q.add(new Point(nr, nc)); //계속 탐색 진행
                } else {
                    //치즈가 녹음
                    cheese[nr][nc] = 0;
                    melted++;
                }
            }
        }

        count -= melted;

        //치즈가 다 녹았다면
        if (count == 0) {
            System.out.println(t);
            System.out.println(melted);
            return;
        } else {
            bfs();
        }
    }

    public static class Point {
        int r, c;

        Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
}
