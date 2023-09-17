// Scanner를 이용하는 방법

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		// 이진탐색 사용시 배열 정리 필요
		Arrays.sort(arr);
		
		int M = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < M; i++) {
			
			// 찾고자 하는 값이 있을 경우 1, 없을 경우 0 출력
			if(binarySearch(arr, sc.nextInt()) >= 0) {
				sb.append(1).append('\n');
			}
			else {
				sb.append(0).append('\n');
			}
		}
		System.out.println(sb);
		
	}
	
	private static int binarySearch(int arr[], int key) {
		
		int low = 0; // 
		int high = arr.length - 1;
		
		//low가 high보다 커질 때까지 반복한다
		while(low <= high) {
			
			int mid = (low + high) / 2; // 중간 위치를 구한다.
			
			// key값이 중간위치의 값보다 작은 경우
			if(key < arr[mid]) {				
				high = mid - 1;				
			}
			
			// key값이 중간위치의 값보다 큰 경우
			else if(key > arr[mid]) {				
				low = mid + 1;				
			} 
			
			else {				
				return mid;				
			}
			
		}
		
		// 찾고자 하는 값이 존재하지 않는 경우
		return -1;		
	}
}