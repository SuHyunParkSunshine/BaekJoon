import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> remainders = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int input = sc.nextInt();
            remainders.add(input % 42);
        }

        Set<Integer> numbers = new HashSet<>(remainders);
        System.out.println(numbers.size());
    }
}