def solution(number):
    answer = []
    my_str = str(number)
    for s in my_str[::-1]:
        answer.append(int(s))
    return answer