import java.util.*;
class Solution {
    boolean solution(String dirs) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < dirs.length(); i++) {
            char k = dirs.charAt(i);
            if (k == '(') {
                s.push(k);
            } else {
                if (s.isEmpty()) return false; //비어있는데 )부터 오면 애초에 괄호쌍이 안맞는거라 false로 판별
                s.pop(); //짝지어지는 경우 )는 굳이 넣지 않고 기존 (만 비운다
            }
        }
        return s.isEmpty(); //스택이 비어있으면 괄호 검사가 완료

    }
}