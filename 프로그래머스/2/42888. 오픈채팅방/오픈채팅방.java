import java.util.*;

class Solution {
    public String[] solution(String[] record) {
     List<String> result = new ArrayList<>();
        
        //아이디와 이름을 담을 map 생성
        Map<String, String> map = new HashMap<>();
        
        //값을 추가하고 변경된 값까지 싹다 일단 저장
        for(String r :record){
            String[] str = r.split(" "); // 한문장을 명령/ID/이름으로 분리
            //Enter나 change인 경우에 값을 map에 넣거나 바꾸기
            if(str[0].equalsIgnoreCase("Enter") || str[0].equalsIgnoreCase("Change")) {
                map.put(str[1],str[2]);
            }
        }
            
        
        for(String r : record){
            String[] str = r.split(" ");
            if(str[0].equals("Enter")) {
                result.add( map.get(str[1]) + "님이 들어왔습니다.");
            } else if(str[0].equals("Leave")){
                result.add( map.get(str[1]) + "님이 나갔습니다.");
            }
    }
        return result.stream().toArray(String[]::new);
}
}