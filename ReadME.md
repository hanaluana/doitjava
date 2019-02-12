## 1. String 클래스의 주요 매서드

1. char charAt(int i)
2. int length()
3. boolean equals(String s)

## 2. 배열 검색

1. 선형검색 (linear search, sequential search)
2. 이진 검색 (binary search)
3. 해시법



- java.util.Arrays에서 Arrays.binarySearch(배열x, 찾고자하는key)
- 검색에 성공한 경우: 일치하는 요소 중 무작위의 인덱스를 반환
- 검색에 실패한 경우: 삽입포인트를 x라고 할 때, -x-1을 반환함
- 