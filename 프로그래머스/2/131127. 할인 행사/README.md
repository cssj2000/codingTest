# [level 2] 할인 행사 - 131127 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/131127) 

### 시간복잡도
O(n*10) -> O(n)

### 해결방안
1. 배열 want, number를 map에 담아 관리 -> 변수명 map1으로 생성
2. discount배열에서 10개씩 값을 뽑아서 map2에 저장한 후 map1과 equals로 계산후 모두 true일 경우 count++

### 꺠달은 부분 / 잘못생각한 부분
1. map끼리 equals가 가능하다는것을 알게됨
2.  map1을 만들 생각은 했지만, discount배열에서 10개씩 뽑아서 map2에 담아서 map1과 equals로 비교할 생각을 하지 못했다. 
