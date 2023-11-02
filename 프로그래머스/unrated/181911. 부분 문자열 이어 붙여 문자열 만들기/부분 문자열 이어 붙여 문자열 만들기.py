def solution(my_strings, parts):
    answer = ''
    for i in range(len(my_strings)):
        start, end = parts[i]
        part_string = my_strings[i][start: end + 1]
        answer += part_string

    return answer