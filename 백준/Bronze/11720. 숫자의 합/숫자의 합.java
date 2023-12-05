// Arrays.stream() Version

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String inputString = br.readLine();

        String[] splitString = inputString.split("");

        int sum = Arrays.stream(splitString)
                .mapToInt(Integer::parseInt)
                .sum();

        System.out.println(sum);
    }
}