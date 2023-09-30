def solution(num_list):
    res1 = 1
    for i in num_list:
        res1 *= i
    res2 = sum(num_list) ** 2

    if res1 < res2:
        return 1
    else:
        return 0