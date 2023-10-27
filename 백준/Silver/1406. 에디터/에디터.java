import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

// ListIterator + BufferedReader + BufferedWriter

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        LinkedList<Character> elementList = new LinkedList<>();

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            elementList.add(str.charAt(i));
        }

        ListIterator<Character> iter = elementList.listIterator();

        while (iter.hasNext()) {
            iter.next();
        }

        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            String command = br.readLine();
            char c = command.charAt(0);
            switch (c) {
                case 'L':
                    if (iter.hasPrevious()) {
                        iter.previous();
                    }
                    break;
                case 'D':
                    if (iter.hasNext()) {
                        iter.next();
                    }
                    break;
                case 'B':
                    //remove()는 next()나 previous()에 의해 반환된 가장 마지막 요소를 리스트에서 제거
                    if (iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                    break;
                case 'P':
                    char letter = command.charAt(2);
                    iter.add(letter);
            }
        }

        for (Character chr : elementList) {
            bw.write(chr);
        }
        bw.flush();
        bw.close();
    }
}
