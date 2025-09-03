import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        
        int[][] ways = {
            {1,2,3,4,5},
            {2,1,2,3,2,4,2,5},
            {3,3,1,1,2,2,4,4,5,5}
        };
        int[] scores = new int[3];
        
        for(int i=0; i<answers.length; i++){
            for(int j=0; j<ways.length; j++){
                if(answers[i] == ways[j][i % ways[j].length])scores[j]++; //정답을 맞출시
            }
        }
        int maxScore = Arrays.stream(scores).max().getAsInt();
        List<Integer> arrList = new ArrayList<>();
        for(int i=0; i<scores.length; i++){
            if(maxScore == scores[i]) arrList.add(i+1);
        }
        
        return arrList.stream().mapToInt(Integer::intValue).toArray();
    }
}