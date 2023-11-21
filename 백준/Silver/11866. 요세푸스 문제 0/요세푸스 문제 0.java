import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

// ArrayList만 사용하는 version

public class Main {

    public static void main(String[] args) throws IOException {

        List<Integer> initialiser = new ArrayList<>();
        List<Integer> resultContainer = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            initialiser.add(i);
        }

        int i = 0;
        while (!initialiser.isEmpty()) {
            // 새로운 idx 계산식
            int idx = (i + K - 1) % initialiser.size();
            int result = initialiser.remove(idx);
            resultContainer.add(result);
            i = idx;
        }

        String strResult = resultContainer.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", ", "<", ">"));

        System.out.println(strResult);
    }
}