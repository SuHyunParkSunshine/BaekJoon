import java.util.Scanner;

public class Main {

    public static int[] arr;
    public static int N;
    public static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];

        queenSolve(0);
        System.out.println(count);
    }

    public static void queenSolve(int depth) {
        if (depth == N) {
            count++;
            return;
        }

        for (int i = 0; i < N; i++) {
            arr[depth] = i;
            // possibility() 해당 열에서 i번째 행에 놓을 수 있는지 검사하는 함수
            if (possibility(depth)) {
                queenSolve(depth + 1);
            }
        }
    }

    public static boolean possibility(int col) {
        for (int i = 0; i < col; i++) {

            // 해당 열의 행과 i열의 행이 일치할 경우(같은 행에 존재할 경우)
            if (arr[col] == arr[i]) {
                return false;
            }
            /*
            * 대각선 상에 놓여있는 경우
            * (열의 차와 행의 차가 같을 경우가 대각선에 놓여있는 경우다)
             */
            else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }
        return true;
    }
}
