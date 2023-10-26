def solution(my_string):
    answer = []
    split = my_string.split('x')
    for i in split:
        answer.append(len(i))
    return answer