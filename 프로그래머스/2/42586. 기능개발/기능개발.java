import java.util.*;
class Solution {
    
  
    public int[] solution(int[] progresses, int[] speeds) {
       List<Integer> answer = new ArrayList<>();
        int n = progresses.length;
        int[] days = new int[n];
        for(int i=0; i<n; i++){
            days[i] = (int) Math.ceil((100 - progresses[i]) / (double)speeds[i]);
        }
        
        int cnt =1;
        int base = days[0]; //기준점
        
        for(int i=1; i<days.length; i++){
            if(base>=days[i]){
                cnt++;
            }else{
                answer.add(cnt);
                cnt = 1;
                base = days[i];
            }
        }
        answer.add(cnt); // 마지막 배포추가
        
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    
    
}