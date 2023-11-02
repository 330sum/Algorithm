def solution(arr, intervals):
    answer = []
    for i in range(len(intervals)):
        start, end = intervals[i]
        answer += arr[start: end + 1]

    return answer