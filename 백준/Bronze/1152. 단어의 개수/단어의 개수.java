// BufferedReader Version

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine().trim();

        String[] split = input.split(" ");

        if (input.isEmpty()) {
            System.out.println(0);
        } else {
            int count = split.length;
            System.out.println(count);
        }
    }
}