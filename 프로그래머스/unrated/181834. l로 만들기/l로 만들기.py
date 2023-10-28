def solution(my_string):
    answer = [i if i > 'l' else 'l' for i in my_string]
    return ''.join(answer)