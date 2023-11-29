import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int count = 0;
    static int K = 0;

    static void swap(int[] a, int idx1, int idx2) {
        count++;
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
        if (K == count) {
            if (a[idx1] < a[idx2]) {
                System.out.println(a[idx1] + " " + a[idx2]);
            } else {
                System.out.println(a[idx2] + " " + a[idx1]);
            }
        }
    }
    static void buildHeap(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }
    }

    static void heapify(int[] arr, int i, int n) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] < arr[smallest]) {
            smallest = left;
        }
        if (right < n && arr[right] < arr[smallest]) {
            smallest = right;
        }
        if (smallest != i) {
            swap(arr, i, smallest);
            heapify(arr, smallest, n);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        buildHeap(arr);
        int n = arr.length;

        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, 0, i);
        }
        if (K > count) {
            System.out.println("-1");
        }
    }
}