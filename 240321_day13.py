#프로그래머스_월간 코드 챌린지 시즌3
#나머지가 1이 되는 수 찾기
#문제 : https://school.programmers.co.kr/learn/courses/30/lessons/87389?language=python3

def solution(n):
    answer = 0
    
    for i in range(1, n):
        if (n % i == 1):
            answer = i
    return answer
