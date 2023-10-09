def solution(array, height):
    answer = 0
    array.append(height)
    array.sort()

    for arr in array:
        if height < arr:
            answer += 1
            
    return answer