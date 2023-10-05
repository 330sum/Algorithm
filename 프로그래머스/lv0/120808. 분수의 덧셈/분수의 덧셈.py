def gcd(a, b):
    while b:
        a, b = b, a % b
    return a


def simplify_fraction(numer, denom):
    common_divisor = gcd(numer, denom)
    numer //= common_divisor
    denom //= common_divisor
    return numer, denom


def solution(numer1, denom1, numer2, denom2):
    denom = denom1 * denom2
    numer = (denom1 * numer2) + (denom2 * numer1)

    simplified_numer, simplified_denom = simplify_fraction(numer, denom)

    answer = [simplified_numer, simplified_denom]

    return answer