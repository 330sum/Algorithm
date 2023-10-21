def solution(my_string, pat):
    replace = ""
    for i in my_string:
        if i == 'A':
            i1 = 'B'
            replace += i1
        elif i == 'B':
            i2 = 'A'
            replace += i2

    if pat in replace:
        return 1
    else:
        return 0