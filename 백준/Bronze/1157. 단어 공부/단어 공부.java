import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toUpperCase();

        Map<Character, Integer> inputHash = new HashMap<>();

        for (char letter : input.toCharArray()) {
            inputHash.put(letter, inputHash.getOrDefault(letter, 0) + 1);
        }

        int count = 0;
        Character result = null;

        int maxValue = Collections.max(inputHash.values());
        for (Map.Entry<Character, Integer> entry : inputHash.entrySet()) {
            if (entry.getValue() == maxValue) {
                result = entry.getKey();
                count++;
            }
        }
        if (count == 1) {
            System.out.println(result);
        } else {
            System.out.println("?");
        }
    }
}