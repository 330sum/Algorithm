def solution(my_string, is_suffix):
    i = len(is_suffix)
    tmp = my_string[-i:]

    if is_suffix == tmp:
        return 1
    else:
        return 0