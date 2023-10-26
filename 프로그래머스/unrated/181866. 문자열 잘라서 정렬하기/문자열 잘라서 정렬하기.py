def solution(my_string):
    split = my_string.split('x')
    answer = [li for li in split if li != '']
    answer.sort()
    return answer