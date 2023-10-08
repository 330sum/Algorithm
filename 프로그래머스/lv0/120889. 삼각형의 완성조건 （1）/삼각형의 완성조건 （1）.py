def solution(sides):
    max_side = max(sides)
    others = sum(sides) - max_side
 
    if max_side < others:
        return 1
    else:
        return 2