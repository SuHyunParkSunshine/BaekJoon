// 재귀
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static StringBuilder sb = new StringBuilder();

    static void move(int n, int from, int to) {
        if (n > 1) {
            move(n-1, from, 6-from-to);
            sb.append(from).append(" ").append(to).append("\n");
            move(n - 1, 6 - from - to, to);
        } else {
            sb.append(from).append(" ").append(to).append("\n");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger count = new BigInteger("2");
        int N = sc.nextInt();

        if (N > 20) {
            System.out.println(count.pow(N).subtract(new BigInteger("1")));
        } else {
            move(N, 1, 3);
            sb.insert(0, (int)Math.pow(2, N) - 1 + "\n");
            System.out.println(sb);
        }
    }
}