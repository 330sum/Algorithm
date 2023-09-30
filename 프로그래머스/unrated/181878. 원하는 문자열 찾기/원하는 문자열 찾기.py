def solution(my_string, pat):
    lower_str = my_string.lower()
    lower_pat = pat.lower()
    if lower_pat in lower_str:
        return 1
    else:
        return 0