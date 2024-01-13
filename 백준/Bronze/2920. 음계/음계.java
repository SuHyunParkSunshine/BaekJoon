import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String whiteSpace = input.replaceAll("\\s", "");
        int result = Integer.parseInt(whiteSpace);

        if (result == 12345678) {
            System.out.println("ascending");
        } else if (result == 87654321) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}