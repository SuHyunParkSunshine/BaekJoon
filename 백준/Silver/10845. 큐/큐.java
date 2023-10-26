import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] que; // 큐용 배열
    public static int front; // 맨 앞의 요소 커서
    public static int back; // 맨 뒤의 요소 커서
    public static int count; // 현재 데이터 개수

    public static void push(int x) {
        que[back] = x;
        back++;
        count++;
    }

    public static int pop() {
        if (count <= 0) {
            return -1;
        }
        int x = que[front];
        front++;
        count--;
        return x;
    }

    public static int size() {
        return count;
    }

    public static int empty() {
        if (count <= 0) return 1;
        else return 0;
    }

    public static int getFront() {
        if (count <= 0) return -1;
        return que[front];
    }

    public static int getBack() {
        if (count <= 0) return -1;
        return que[back - 1];
    }

    public static void main(String[] args) throws IOException {
        count = front = back = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        que = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String menu = st.nextToken();
            int x;

            switch (menu) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    push(num);
                    break;

                case "pop":
                    x = pop();
                    System.out.println(x);
                    break;

                case "size":
                    x = size();
                    System.out.println(x);
                    break;

                case "empty":
                    x = empty();
                    System.out.println(x);
                    break;

                case "front":
                    x = getFront();
                    System.out.println(x);
                    break;

                case "back":
                    x = getBack();
                    System.out.println(x);
                    break;
            }
        }
    }
}
