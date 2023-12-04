import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            int N = Integer.parseInt(st.nextToken());
            String S = st.nextToken();
            String[] splitS = S.split("");

            for (String letter : splitS) {
                for (int j = 0; j < N; j++) {
                    sb.append(letter);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}