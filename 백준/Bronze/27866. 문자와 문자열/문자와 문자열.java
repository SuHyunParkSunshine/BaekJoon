import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputString = br.readLine();
        int num = Integer.parseInt(br.readLine());

        String[] splitString = inputString.split("");

        String result = splitString[num - 1];

        System.out.println(result);
    }
}