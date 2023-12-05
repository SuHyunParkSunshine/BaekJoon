// for Loop Version

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String inputString = br.readLine();

        String[] splitString = inputString.split("");
        List<Integer> splitNum = new ArrayList<>();

        for (String element : splitString) {
            splitNum.add(Integer.parseInt(element));
        }

        int sum = 0;
        for (int i = 0; i < splitNum.size(); i++) {
            sum += splitNum.get(i);
        }
        System.out.println(sum);
    }
}