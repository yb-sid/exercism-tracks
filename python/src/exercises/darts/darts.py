from math import sqrt


def score(x, y):
    dist = get_distance_from_origin(x, y)
    if dist > 10:
        return 0
    elif dist <= 10 and dist > 5:
        return 1
    elif dist <= 5 and dist > 1:
        return 5
    elif dist <= 1 and dist >= 0:
        return 10
    else:
        return -1


def get_distance_from_origin(x, y):
    sq_sum = y * y + x * x
    return sqrt(sq_sum)
