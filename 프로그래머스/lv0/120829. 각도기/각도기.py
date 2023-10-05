def solution(angle):
    answer = [1, 2, 3, 4]
    if 0 < angle < 90:
        return answer[0]
    if angle == 90:
        return answer[1]
    if 90 < angle < 180:
        return answer[2]
    if angle == 180:
        return answer[3]
  