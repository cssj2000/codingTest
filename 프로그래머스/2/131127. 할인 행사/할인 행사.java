import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> map1 = new HashMap<>();
        
        //want와 number배열을 map에 넣기
        for(int i=0; i<want.length; i++){
            map1.put(want[i], number[i]);
        }
        
        int answer = 0; //want와 discount가 10일 겹치는 경우 count하기 위한 변수
        
        for(int i=0; i<=discount.length-10; i++){
            Map<String, Integer> map2 = new HashMap<>(); //discount에서의 10개를 map에 put
            for(int j=i; j<i+10; j++){
                if(map1.containsKey(discount[i])){
                    map2.put(discount[j], map2.getOrDefault(discount[j],0)+1);
                }
            }
           
            if(map1.equals(map2)) answer++;
        }
        
        
        
        return answer;
    }
}