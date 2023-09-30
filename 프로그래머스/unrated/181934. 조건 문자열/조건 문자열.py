def solution(ineq, eq, n, m):
    if eq == '=':
        if ineq == '<':
            return 1 if n <= m else 0
        if ineq == '>':
            return 1 if n >= m else 0
    if eq == '!':
        if ineq == '<':
            return 1 if n < m else 0
        if ineq == '>':
            return 1 if n > m else 0