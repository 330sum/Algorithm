def solution(num_list):
    even_num = ''
    odd_num = ''
    for i in num_list:
        if i % 2 == 0:
            even_num += str(i)
        else:
            odd_num += str(i)
    return int(even_num) + int(odd_num)