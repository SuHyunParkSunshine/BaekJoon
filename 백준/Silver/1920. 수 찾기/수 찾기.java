// BufferedReader 사용
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static int arr[];

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 배열 정리
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < M; i++) {
			//찾고자 하는 값이 있을 경우 1, 없는 경우 0
			if(binarySearch(Integer.parseInt(st.nextToken())) >= 0) {
				sb.append(1).append('\n');
			}
			else {
				sb.append(0).append('\n');
			}
		}
		System.out.println(sb);
	}
	
	private static int binarySearch(int key) {
		
		int low = 0; // 탐색범위의 왼쪽 끝 인덱스
		int high = arr.length - 1; // 탐색범위의 오른쪽 끝 인덱스
		
		// low가 high보다 커지기 전까지 반복한다
		while(low <= high) {
			
			int mid = (low + high) / 2; // 중간위치의 값을 구한다
			
			// key값이 중간위치의 값보다 작은 경우
			if(key < arr[mid]) {
				high = mid - 1;
			}
			// key값이 중간 위치의 값보다 큰 경우
			else if(key > arr[mid]) {
				low = mid + 1;				
			}
			// key값과 중간 위치의 값이 같은 경우
			else {
				return mid;
			}			
		}		
		
		// 찾고자 하는 값이 존재하지 않는 경우
		return -1;		
	}
}