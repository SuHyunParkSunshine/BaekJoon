import java.util.Collections;
import java.util.Scanner;
import java.util.PriorityQueue;

// Scanner version
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                if (!que.isEmpty()) {
                    sb.append(que.poll()).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else {
                que.add(num);
            }
        }
        System.out.println(sb.toString());
    }
}