def solution(my_string, is_prefix):
    i = len(is_prefix)
    tmp = my_string[:i]
    
    if is_prefix == tmp:
        return 1
    else:
        return 0