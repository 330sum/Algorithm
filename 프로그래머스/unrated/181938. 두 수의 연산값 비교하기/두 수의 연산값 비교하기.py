def solution(a, b):
    res1 = str(a) + str(b)
    res2 = 2 * a * b
    return max(int(res1), int(res2))