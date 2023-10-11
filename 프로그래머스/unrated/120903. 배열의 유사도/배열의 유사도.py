def solution(s1, s2):
    answer = 0
    for i in s2:
        for j in s1:
            if i == j:
                answer += 1
    return answer