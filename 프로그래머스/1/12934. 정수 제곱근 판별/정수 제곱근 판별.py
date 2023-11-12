import math


def solution(number):
    if number <= 0:
        return -1

    isqrt = math.isqrt(number)

    if isqrt ** 2 == number:
        return (isqrt + 1) ** 2
    return -1