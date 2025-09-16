# [level 2] 주식가격 - 42584 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/42584) 

### 시간 복잡도
stack push, pop만 하기때문에 O(n)
### 해결방법
stack에 prices값 말고 인덱스를 담는 방법
계산을 더 이상 할 필요 없는 값은 pop한 후 i-j를 하여 주식이 떨어지지 않은 기간을 계산
### 깨달은 부분
int top = stack.peek()를 for-while()전에 선언을 한후 

prices[top]와 prices[i]를 비교하여  top이 고정된 상태로 비교를 게속하게됨
