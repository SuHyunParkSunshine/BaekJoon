import java.util.Scanner;

public class Main {

    static int[] buff;
    static long count;
    static void __mergeSort(int[] a, int left, int right) {

        if (left < right) {
            int i;
            int centre = (left + right) / 2;
            int p = 0;
            int j = 0;
            int k = left;

            __mergeSort(a, left, centre);
            __mergeSort(a, centre + 1, right);

            for (i = left; i <= centre; i++) {
                buff[p++] = a[i];
            }

            while (i <= right && j < p) {
                if (buff[j] <= a[i]) {
                    a[k++] = buff[j++];
                } else {
                    a[k++] = a[i++];
                    count += (p - j);
                }
            }

            while (j < p) {
                a[k++] = buff[j++];
            }
        }
    }

    static void mergeSort(int[] a, int n) {
        buff = new int[n];
        __mergeSort(a, 0, n - 1);
        buff = null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, N);
        System.out.println(count);
    }
}