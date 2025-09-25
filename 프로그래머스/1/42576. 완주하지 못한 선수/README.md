# [level 1] 완주하지 못한 선수 - 42576 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/42576) 


### 시간 복잡도

completion 배열 크기 = M

participant 배열 크기 = N

전체 시간 복잡도 = O(N + M) ≈ O(N)
(항상 M = N - 1 이므로 O(N)으로 단순화 가능)


### 해결 방안

completion 배열을 HashMap에 저장 (이름 → 등장 횟수)

map.put(str, map.getOrDefault(str, 0) + 1);

 동명이인이 있으면 value 값이 +1씩 증가

participant 배열을 순회하면서

map.getOrDefault(str, 0) == 0 → 완주하지 못한 선수 → 반환

그렇지 않으면 map.put(str, map.get(str) - 1) → 등장 횟수 1 감소

import java.util.HashMap;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();

        // 완주자 명단 저장
        for (String name : completion) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        // 참가자 명단 확인
        for (String name : participant) {
            if (map.getOrDefault(name, 0) == 0) {
                return name; // 완주 못한 선수
            }
            map.put(name, map.get(name) - 1);
        }

        return null;
    }
}


### 깨달은 점

기본 변수는 i++ 로 누적 증가시키지만,

HashMap에서는 map.put(key, map.getOrDefault(key, 0) + 1) 로 value 값을 누적 관리한다.

이를 통해 동명이인 문제도 처리 가능하다는 것을 알게 됨
