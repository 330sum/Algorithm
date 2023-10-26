def solution(num_list):
    even_sum = 0
    odd_sum = 0
    for i in range(len(num_list)):
        if i % 2 == 0:
            even_sum += int(num_list[i])
        else:
            odd_sum += int(num_list[i])

    if even_sum < odd_sum:
        return odd_sum
    else:
        return even_sum