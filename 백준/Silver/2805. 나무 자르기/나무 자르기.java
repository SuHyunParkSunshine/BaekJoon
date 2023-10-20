// Use Scanner

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] tree = new int[N];

        int min = 0;
        int max = 0;


        for (int i = 0; i < N; i++) {
            tree[i] = sc.nextInt();
        }
        Arrays.sort(tree);

        max = tree[N - 1];

        // 이진 검색(Upper Bound)
        while (min < max) {

            int mid = (max + min) / 2;
            long sum = 0;

            for (int treeHeight : tree) {
                if (treeHeight - mid > 0) {
                    sum += (treeHeight - mid);
                }
            }

            if (sum < M) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        System.out.println(min - 1);
    }
}