import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int mins = Integer.parseInt(st.nextToken());
        int secs = Integer.parseInt(st.nextToken());

        int time = Integer.parseInt(br.readLine());
      
        mins += time / 60;
        secs += time % 60;

        mins += secs / 60;
        secs = secs % 60;

        hour += mins / 60;
        mins = mins % 60;

        hour = hour % 24;

        System.out.println(hour + " " + mins + " " + secs);
    }
}