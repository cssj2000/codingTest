import java.util.*;
class Solution
{
    public int solution(String s){
    int answer = -1;
        
    ArrayDeque<Character> stack = new ArrayDeque<>();

    for(char c : s.toCharArray()){
        if(!stack.isEmpty() && stack.peek().equals(c)){
            stack.pop(); //짝이 맞는 경우
        }else {
        //짝이 안맞는 경우
        stack.push(c);
        } 
    }
        
    answer = stack.isEmpty() ? 1 : 0;
        
        
    return answer;
    }
}