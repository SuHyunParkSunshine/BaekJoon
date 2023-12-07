import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        List<Integer> numbers = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(input);

        while (st.hasMoreTokens()) {
            numbers.add(Integer.parseInt(st.nextToken()));
        }

        int squaredSum = numbers.stream()
                .mapToInt(number -> (int) Math.pow(number, 2))
                .sum();

        int result = squaredSum % 10;

        System.out.println(result);
    }
}