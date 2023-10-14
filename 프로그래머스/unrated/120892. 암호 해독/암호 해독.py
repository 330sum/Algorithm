def solution(cipher, code):
    answer = ''
    clue = int(len(cipher) / code)

    for i in range(1, clue + 1):
        print(i)
        answer += cipher[i * code - 1]

    return answer