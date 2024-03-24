def solution(my_string, m, c):
    temp_list = []
    length = len(my_string)
    loop = length // m
    for i in range(loop):
        temp_list.append(my_string[m * i:m * i + m][c - 1])

    return ''.join(temp_list)