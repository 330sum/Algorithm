def solution(number):
    my_str = str(number)
    my_list = list(my_str)
    my_list.sort()
    my_list.reverse()

    return int(''.join(my_list))