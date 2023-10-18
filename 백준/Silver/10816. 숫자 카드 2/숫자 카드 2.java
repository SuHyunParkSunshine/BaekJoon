// [HashMap + BufferedReader + StringBuilder]

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // card의 숫자와 횟수를 저장해둘 hashmap 생성
        HashMap<Integer, Integer> card = new HashMap<>();

        int N = Integer.parseInt(br.readLine());

        // card의 숫자를 받아서 string 형태로 저장해둠
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // card hashmap에 저장
        while (st.hasMoreTokens()) {
            int key = Integer.parseInt(st.nextToken());

            card.put(key, card.getOrDefault(key, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int compare = Integer.parseInt(st.nextToken());         

            sb.append(card.getOrDefault(compare, 0)).append(" ");
        }
        System.out.println(sb);
    }
}