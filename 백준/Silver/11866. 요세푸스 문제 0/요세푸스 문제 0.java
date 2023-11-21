import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            queue.add(i + 1);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < K - 1; i++) {
                int pop = queue.poll();
                queue.add(pop);
            }
            int pop = queue.poll();
            result.add(pop);
        }
        String strResult = result.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", ", "<", ">"));
        System.out.println(strResult);
    }
}