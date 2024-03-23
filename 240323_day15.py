# 프로그래머스_코딩 기초 트레이닝
# 코드 처리하기
# 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181932?language=python3

def solution(code):
    mode = 0
    ret = ''
    for idx, i in enumerate(code):
        if i == '1':
            mode = 1 - mode  
        elif mode == 0 and idx % 2 == 0:
            ret += i
        elif mode == 1 and idx % 2 == 1:
            ret += i

    if ret == '':
        ret = "EMPTY"
    return ret

# 다른 사람 풀이 너무 잘풀어서 참고하기
# def solution(code):
#    return "".join(code.split("1"))[::2] or "EMPTY"
