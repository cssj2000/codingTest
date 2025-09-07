import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] challenger = new int[N+2];
        for(int stage : stages){
            challenger[stage]++; //도전자별 클리어 스테이지 인원체크.
        }
        double total = stages.length;
        Map<Integer, Double> fails = new HashMap<>();
        for(int i=1; i<=N; i++){
            if(challenger[i]==0) {fails.put(i,0.);}//스테이지인원 0명 -> 실패율0
            else{fails.put(i, challenger[i]/total); //스테이지별 실패율 저장
            total-=challenger[i];
                }
        }
        

        return fails.entrySet().stream().sorted((a,b)->
            a.getValue().equals(b.getValue()) ? Integer.compare(a.getKey(),b.getKey()) : Double.compare(b.getValue(), a.getValue())
            ).mapToInt(Map.Entry::getKey).toArray();
        
    }
}