def solution(my_string, pat):
    answer = 0
    length = len(pat)
    for i in range(len(my_string)):
        if my_string[i:length + i] == pat:
            answer += 1
    return answer