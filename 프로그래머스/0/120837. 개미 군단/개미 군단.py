def solution(hp):
    ant_1 = 5
    ant_2 = 3
    ant_3 = 1

    num_1 = hp // ant_1
    hp -= (num_1 * ant_1)
    num_2 = hp // ant_2
    hp -= (num_2 * ant_2)
    num_3 = hp // ant_3
    hp -= (num_3 * ant_3)

    answer = num_1 + num_2 +num_3

    return answer