# [level 2] 올바른 괄호 - 12909
[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12909)

### 시간 복잡도
문자열 길이가 최대 100,000 → O(N) 알고리즘 필요  
스택 push/pop → O(1) → 전체 시간복잡도 O(N)

## 해결 방법
- '('는 push  
- ')'일 때 스택이 비어 있으면 false, 아니면 pop  
- 문자열 끝까지 확인 후 스택이 비어 있으면 true  

## 초반 잘못 생각했던 부분
- 처음엔 `)`도 push해야 한다고 착각  
- 실제로는 `)`가 오면 pop만 하면 된다.
