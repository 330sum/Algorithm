def solution(n, k):
    answer = []
    for i in range(1, n + 1):
        result = i * k
        if result > n:
            break
        answer.append(result)
    return answer