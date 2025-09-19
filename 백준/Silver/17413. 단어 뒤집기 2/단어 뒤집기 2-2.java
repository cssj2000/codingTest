package codingTest_practice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        StringBuilder sb = new StringBuilder();
        int idx = 0;

        while (idx < str.length()) {
            if (str.charAt(idx) == '<') {
                // 태그 시작
                int close = str.indexOf('>', idx);
                sb.append(str.substring(idx, close + 1)); // 태그 그대로
                idx = close + 1;
            } else {
                // 태그 밖 문자열
                int nextTag = str.indexOf('<', idx);
                if (nextTag == -1) nextTag = str.length();

                String part = str.substring(idx, nextTag); // 태그 전까지
                for (String word : part.split(" ", -1)) {
                    sb.append(new StringBuilder(word).reverse());
                    sb.append(" ");
                }
                sb.setLength(sb.length() - 1); // 마지막 공백 제거
                idx = nextTag;
            }
        }

        System.out.println(sb.toString());


    }
}
