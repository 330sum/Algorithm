def solution(slice, n):
    if n % slice == 0:
        answer = int(n / slice)
    else:
        answer = int(n / slice) + 1
    return answer