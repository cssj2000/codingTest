import java.util.*;
class Solution {
    
    private static final Map<Character, Character> map = Map.of(
            '(', ')',
            '{', '}',
            '[', ']'
    );
    
 private static boolean test(String str) {
        
        Stack<Character> stack = new Stack<>();

        for(char release : str.toCharArray()){
            //열린괄호일 때
            if (map.containsKey(release)) {
                stack.push(release);
            } else { //닫힘 괄호일 경우
                if(stack.isEmpty()) return false;
                if (map.get(stack.peek())!=release) return false;
                stack.pop();


            }

            }

        return stack.isEmpty();
}

    public static int solution(String s) {
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {

            String rotated = s.substring(i) + s.substring(0,i);
            if(test(rotated)) cnt++;
        }

        return cnt;

}
    
}