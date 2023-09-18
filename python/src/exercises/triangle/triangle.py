def check_inequality(a, b, c):
    if a + b < c or b + c < a or c + a < b:
        return False
    else:
        return True


def equilateral(sides):
    a, b, c = sides[0], sides[1], sides[2]
    return (a != 0 and b != 0 and c != 0) and check_inequality(a, b, c) and a == b == c


def isosceles(sides):
    a, b, c = sides[0], sides[1], sides[2]
    return (
        check_inequality(a, b, c) and (a == b or b == c or c == a) or equilateral(sides)
    )


def scalene(sides):
    a, b, c = sides[0], sides[1], sides[2]
    return check_inequality(a, b, c) and a != b and b != c and c != a
