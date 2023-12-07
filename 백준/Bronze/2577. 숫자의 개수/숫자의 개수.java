import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        Map<Character, Integer> numberCounting = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            numberCounting.put((char)(i + '0'), 0);
        }

        String multipliedNum = String.valueOf(A * B * C);

        for (char digit : multipliedNum.toCharArray()) {
            numberCounting.put(digit, numberCounting.get(digit) + 1);
        }

        for (int value : numberCounting.values()) {
            System.out.println(value);
        }
    }
}