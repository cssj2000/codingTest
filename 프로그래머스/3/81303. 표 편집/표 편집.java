import java.util.*;

class Solution {
    public String solution(int n, int k, String[] cmd) {
    
        Stack<Integer> removed = new Stack<>(); //삭제행 담을 곳
        int[] up = new int[n + 2];
        int[] down = new int[n + 2];
        k++;

        
        for(int i=0; i<n+2; i++){
            up[i] = i-1;
            down[i] = i+1;
        }
        
        for(String c : cmd){
            //삭제
            if(c.charAt(0) == 'C'){
                down[up[k]] = down[k]; //윗 노드는 현노드의 아래노드를 가르킴
                up[down[k]] = up[k]; //자신의 아래노드가 자신의 윗노드 가르킴               
                removed.push(k); //삭제한 노드 스택에 저장
                //삭제하는 노드의 아래노드가 마지막행인경우
                k = (down[k] > n) ? up[k] : down[k];
            } 
            else if(c.charAt(0) == 'Z'){
                int restore = removed.pop();
                down[up[restore]] = restore;
                up[down[restore]] = restore;
                }
            else{
                String[] s =  c.split(" ");
                int direction = Integer.parseInt(s[1]);
                for(int i=0; i<direction; i++){
                    k = s[0].equals("U") ? up[k] : down[k] ;
                }
            }
        }
        
        char[] answer = new char[n];
        Arrays.fill(answer,'O');
        
        //removed에 남아있는 값이 삭제 값
        for(int i : removed){
            answer[i-1] = 'X';
        }
        
        
        return String.valueOf(answer);
    
    
    
    }
}