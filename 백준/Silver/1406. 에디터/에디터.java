// Stack + BufferedReader + BufferedWriter

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> leftStk = new Stack<>();
        Stack<Character> rightStk = new Stack<>();

        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            leftStk.push(str.charAt(i));
        }
        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            String inputString = br.readLine();
            char command = inputString.charAt(0);
            switch (command) {
                case 'L':
                    if (!leftStk.isEmpty()) {
                        rightStk.push(leftStk.pop());
                    }
                    break;
                case 'D':
                    if (!rightStk.isEmpty()) {
                        leftStk.push(rightStk.pop());
                    }
                    break;
                case 'B':
                    if (!leftStk.isEmpty()) {
                        leftStk.pop();
                    }
                    break;
                case 'P':
                    char letter = inputString.charAt(2);
                    leftStk.push(letter);
                    break;
            }
        }
        while (!leftStk.isEmpty()) {
            rightStk.push(leftStk.pop());
        }

        while (!rightStk.isEmpty()) {
            bw.write(rightStk.pop());
        }
        bw.flush();
        bw.close();
    }
}