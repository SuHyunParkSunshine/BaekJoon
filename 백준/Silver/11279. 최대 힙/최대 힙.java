import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

// BufferedReader version
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < N) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                if (que.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(que.poll()).append("\n");
                }
            } else {
                que.add(num);
            }
            i++;
        }
        System.out.println(sb.toString());
    }
}