import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arrN = new int[N];
        for (int i = 0; i < arrN.length; i++) {
            int num = sc.nextInt();
            arrN[i] = num;
        }

        int M = sc.nextInt();

        int[] arrM = new int[M];
        for (int i = 0; i < arrM.length; i++) {
            int num = sc.nextInt();
            arrM[i] = num;
        }

        Set<Integer> setN = new HashSet<>();
        for (int i = 0; i < N; i++) {
            setN.add(arrN[i]);
        }

        for (int i = 0; i < M; i++) {
            if (setN.contains(arrM[i])) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        sc.close();
    }
}
