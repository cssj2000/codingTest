# [level 2] 할인 행사 - 131127 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/131127) 

### 시간복잡도
discount배열 전체를 돌면서 이중루프에서는 discount배열을 10개씩 검사 -> O(10*n)
즉, O(n)

### 해결방안
1. 배열 want, number를 map에 담아 관리 -> 변수명 map1으로 생성
2. discount배열에서 10개씩 값을 뽑아서 map2에 저장한 후 map1과 equals로 계산후 모두 true일 경우 count++

### 꺠달은 부분 / 잘못생각한 부분
1. HashMap.equals()를 이용하면 key-value 쌍이 전부 같을 때만 true가 된다는 걸 알게됐다
2. 처음엔 map1만 생각했지만 discount를 10일 단위로 잘라서 map2와 비교하는 아이디어를 떠올리지 못했다
