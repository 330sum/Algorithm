def solution(num_list, n):
    answer = []
    length = len(num_list)
    
    for i in range(n, length):
        answer.append(num_list[i])
    for i in range(0, n):
        answer.append(num_list[i])
    return answer