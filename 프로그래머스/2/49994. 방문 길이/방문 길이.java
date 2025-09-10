import java.util.*;
class Solution {
    public int solution(String dirs) {
        int row = 0, col = 0; // 현재 위치
        HashSet<String> set = new HashSet<>();

        //문자열을 각각 char배열에 담아서 문자 하나씩 인식하도록 반복문 설정
        for (char dir : dirs.toCharArray()) {
            int after_row = row, after_col = col; //이동후 좌표

            switch (dir) {
                case 'U': after_row++; break;
                case 'D': after_row--; break;
                case 'R': after_col++; break;
                case 'L': after_col--; break;
            }

            if (after_row < -5 || after_row > 5 || after_col < -5 || after_col > 5) continue;

         
            String path1 = row + "," + col + "->" + after_row + "," + after_col;
            String path2 = after_row + "," + after_col + "->" + row + "," + col;
            set.add(path1);
            set.add(path2);

            // 좌표 이동
            row = after_row;
            col = after_col;
        }

      
        return set.size() / 2;
    }

}