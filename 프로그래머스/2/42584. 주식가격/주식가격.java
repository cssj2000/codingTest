import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int N = prices.length;
        int[] answer = new int[N];
        
        stack.push(0); //stack.peek() 사용시 예외가 안뜨게 하기 위해 미리 0을 push
        
        for(int i=1; i<N; i++){
            //값이 떨어졌을 경우 떨어진 값 pop
            while(!stack.isEmpty() && prices[stack.peek()] > prices[i]){
                int j = stack.pop();
                answer[j] = i-j;
            }
            //값이 유지되거나 오른 경우
            stack.push(i);
        }
        
        //살아남은 배열을 옮겨야 됨
        while(!stack.isEmpty()){
            int j = stack.pop();
            answer[j] = N-1 -j; 
        }
        
         
        return answer;
    }
}