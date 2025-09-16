# [level 2] 주식가격 - 42584 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/42584) 

### 시간 복잡도
각 인덱스는 최대 1번 push, 1번 pop만 하므로 전체 시간 복잡도는 O(n).
### 해결방법
스택에는 값이 아닌 인덱스를 저장한다.
새로 들어온 값이 이전 값보다 작아지면, 스택에서 pop하면서 해당 인덱스의 기간을 i - j로 계산한다.
### 깨달은 부분
int top = stack.peek()를 미리 선언하면, while 안에서 top이 갱신되지 않고 고정된 상태로 비교가 반복된다.

따라서 prices[stack.peek()]처럼 while 안에서 매번 갱신된 top을 확인해야 한다.
