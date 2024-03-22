#프로그래머스_코딩테스트입문
#점의 위치 구하기
#문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120841?language=python3

def solution(dot):
    if dot[0] > 0 and dot[1] > 0:
        return 1
    elif dot[0] < 0 and dot[1] > 0:
        return 2
    elif dot[0] < 0 and dot[1] < 0:
        return 3
    else:
        return 4
