def solution(n_str):
    for c in n_str:
        if c != '0':
            return n_str[n_str.index(c):]