def solution(arr, idx):
    for i in arr[idx:]:
        if (i == 1):
            for j in range(len(arr[idx:])):
                if arr[idx:][j] == 1:
                    return j + idx
                    break
    return -1
