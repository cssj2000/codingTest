import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        ArrayDeque<String> c1 = new ArrayDeque<>();
        ArrayDeque<String> c2 = new ArrayDeque<>();
        
        for(String str : cards1){
            c1.add(str);
        }
        for(String str : cards2){
            c2.add(str);
        }
        
        int goal_idx=0;
        
        //두개의 큐가 모두 비어있을때는 문장이 완성됐다고 판단 -> 종료
        while(!(c1.isEmpty() && c2.isEmpty()) && goal_idx < goal.length){
            //goal과 cards1 첫번째가 일치하는 경우
            if(!c1.isEmpty() && c1.peek().equals(goal[goal_idx])){
                c1.poll();
                goal_idx++;
            }
            else if(!c2.isEmpty() && c2.peek().equals(goal[goal_idx])){
                c2.poll();
                goal_idx++;
                
            }
            //둘다 일치하지 않는 경우
            else{
                return "No";
            }  
            
        }
        
        return "Yes";
    }
}