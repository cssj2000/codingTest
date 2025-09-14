# [level 2] 짝지어 제거하기 - 12973 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12973) 

시간복잡도
문자열 길이 최대 10,000,000 -> O(N) 알고리즘 필요
ArrayDeque push/pop -> O(1) -> 전체 시간복잡도 O(N)

해결방법
Stack보다 성능 좋은 ArrayDeque사용하여 문자를 저장
스택에 값이 있고 같은 문자가 들어올 시 pop, 다른문자 들어오면 push
ArrayDeque에 값이 비어있을 시 1 값있을 시 0을 반환 -> 삼항 연산자 사용
