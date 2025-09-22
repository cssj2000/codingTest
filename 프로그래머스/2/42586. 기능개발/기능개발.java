import java.util.*;
class Solution {
    
    // 몇 일걸리는지 계산해주는 메서드
    public int dayCalculator(int p, int s){
        double divide =  (100-p) / (double)s;
        int d_day = (int) Math.ceil(divide); 
        return d_day;
    }
    
    
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayDeque<Integer> p = new ArrayDeque<>();   
        ArrayDeque<Integer> s = new ArrayDeque<>();   
        
        //진행도를 큐에 담기
        for(int i : progresses){
            p.add(i);
        }
        //속도를 큐에 담기
        for(int i : speeds){
            s.add(i);   
        }
        //맨 앞에 있는 작업 기준점 잡기
        int fp = p.poll();
        int fs = s.poll();
        int cnt =1;
        
        while(true){
            //다음 작업 기준 초기화
            int rf = p.peek();
            int rs = s.peek();
            //맨앞 진행률 보타 바로 뒤의 진행률이 짧은 경우
            if(dayCalculator(fp,fs) >= dayCalculator(rf,rs)){
                p.poll();
                s.poll();
                cnt++;
                if(p.isEmpty()){
                    answer.add(cnt); 
                    break;
                }
            }else{ //맨 앞 진행률 보다 진행률이 길어지는 시점 발생
            answer.add(cnt);//기준점 바뀌는순간 cnt 저장
            cnt = 1; //기준점 바꼈으니까 cnt 초기화
            
            //새로운 기준점으로 초기화
            fp = p.poll();
            fs = s.poll();
            if(p.isEmpty()){
                answer.add(cnt);
                break;
            }
        }
    }
        
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    
    
}