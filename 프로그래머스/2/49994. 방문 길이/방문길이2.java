package codingTest_practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution2 {
    private static final Map<Character, int[]> map = new HashMap<>();

    //좌표값에 해당하는지 체크
    private static boolean isRange(int after_x, int after_y){
        return (after_x >= 0 && after_x <11) && (after_y >=0 && after_y<11);
    }

    //좌표판 지정
    private static void init(){
        map.put('U',new int[]{0,1});
        map.put('D',new int[]{0,-1});
        map.put('R',new int[]{1,0});
        map.put('L',new int[]{-1,0});
    }
    private static int solution(String dirs) {
        init();//좌표 생성
        int x=5, y=5; //초기 좌표값 지정
        Set<String> set = new HashSet<>(); //중복경로 제외하고 담을 set 생성
        for (int i = 0; i < dirs.length(); i++) {
            int[] offset = map.get(dirs.charAt(i));

            int after_x = x +offset[0]; // 원래 좌표를 이동시키고 after_x에 반영
            int after_y = y + offset[1]; // 원래 좌표를 이동시키고 after_y에 반영


            if(!isRange(after_x,after_y)) continue;

            set.add(x + "," + y + "->" + after_x+ "," + after_y);
            set.add(after_x + "," + after_y + "->" + x + "," + y);

            //원래 좌표 이동
            x= after_x;
            y = after_y;
        }

        return set.size() / 2;

    }

}
