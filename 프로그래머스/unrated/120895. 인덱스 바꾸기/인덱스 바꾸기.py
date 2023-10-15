def solution(my_string, num1, num2):
    answer = ''
    my_list = list(my_string)

    tmp = my_list[num1]
    my_list[num1] = my_list[num2]
    my_list[num2] = tmp

    for i in my_list:
        answer += i

    return answer