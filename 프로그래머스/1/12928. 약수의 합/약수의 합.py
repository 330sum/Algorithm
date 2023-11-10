def solution(n):
    answer = 0
    약수 = []
    for i in range(1, n + 1):
        if n % i == 0:
            약수.append(i)
    answer = sum(약수)
    return answer