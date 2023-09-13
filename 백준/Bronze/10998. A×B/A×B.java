import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner sr = new Scanner(System.in);
		
		int a = sr.nextInt();
		int b = sr.nextInt();
		
		System.out.println(a * b);
		
		sr.close();
	}
}