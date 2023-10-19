def solution(num_list):
    num_list.sort(reverse=True)
    for i in range(0, 5):
        num_list.pop()
    num_list.sort()
    return num_list