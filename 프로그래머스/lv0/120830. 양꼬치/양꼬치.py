def solution(n, k):
    food = 12000
    drink = 2000
    service = int(n / 10)
    
    answer = (food * n) + (drink * (k - service))
    return answer