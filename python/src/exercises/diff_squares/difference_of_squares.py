def square_of_sum(N):
    sum = (N * (N + 1)) // 2
    return sum * sum


def sum_of_squares(N):
    return (N * (N + 1) * (2 * N + 1)) // 6


def difference_of_squares(N):
    return square_of_sum(N) - sum_of_squares(N)
