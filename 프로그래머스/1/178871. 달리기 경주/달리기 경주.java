import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {

        String[] answer = players.clone(); //배열 복사
        Map<String, Integer> m = new HashMap<>();
        //players에다가 각각 인덱스 값을 지정해서 넣음
        for(int i=0; i<answer.length; i++){
            m.put(answer[i],i);
        }
        
        for(String str : callings){
            int idx = m.get(str); //map에 저장된 str의 value
            int frontIdx = idx-1; //map에 저장된 str앞에 있는 value 값
            
            String frontPlayer = answer[frontIdx]; //앞 선수의 이름
            answer[frontIdx] = answer[idx];
            answer[idx] = frontPlayer;
            
            m.put(str, frontIdx);
            m.put(frontPlayer, idx);
            
        }
    
        return answer;
        
        
    }
}