def solution(arr, n):
    answer = []
    arr_length = len(arr)
    if arr_length % 2 != 0:
        for i in range(len(arr)):
            if i % 2 == 0:
                arr_plus_n = arr[i] + n
                answer.append(arr_plus_n)
            else:
                answer.append(arr[i])
    else:
        for i in range(len(arr)):
            if i % 2 != 0:
                arr_plus_n = arr[i] + n
                answer.append(arr_plus_n)
            else:
                answer.append(arr[i])

    return answer