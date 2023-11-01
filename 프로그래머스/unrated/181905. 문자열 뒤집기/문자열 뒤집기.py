def solution(my_string, s, e):
    answer = ''
    for i in range(len(my_string)):
        answer += my_string[:s]
        answer += my_string[s:e + 1][::-1]
        answer += my_string[e + 1:]
        return answer