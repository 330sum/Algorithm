def solution(money):
    answer = []
    americano_price = 5500

    count = int(money / americano_price)
    answer.append(count)

    rest = money - (americano_price * count)
    answer.append(rest)
    
    return answer