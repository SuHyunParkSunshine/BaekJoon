import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char input = sc.nextLine().charAt(0);

        if (Character.isDigit(input)) {
            int num = Integer.parseInt(String.valueOf(input));
            int result = 48 + num;
            System.out.println(result);
        } else {
            int result = (int) input;
            System.out.println(result);
        }
    }
}