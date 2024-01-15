import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String data = br.readLine();
            String[] splitData = data.split(" ");

            String name = splitData[0];
            int age = Integer.parseInt(splitData[1]);
            int weight = Integer.parseInt(splitData[2]);

            if (data.equals("# 0 0")) break;

            if (age > 17 || weight >= 80) {
                System.out.println(name + " Senior");
            } else {
                System.out.println(name + " Junior");
            }
        }
    }
}