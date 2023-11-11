def solution(N):
    answer = 0
    s = str(N)
    for i in s:
        answer += int(i)
    return answer