def classify(number):
    """A perfect number equals the sum of its positive divisors.

    :param number: int a positive integer
    :return: str the classification of the input integer
    """
    if number < 1:
        raise ValueError("Classification is only possible for positive integers.")
    divisors = get_divisors(number)
    aliquot_sum = sum(divisors)

    if aliquot_sum < number:
        return "deficient"
    elif aliquot_sum > number:
        return "abundant"
    else:
        return "perfect"


def get_divisors(n):
    divisors = []
    for div in range(1, n):
        if n % div == 0:
            divisors.append(div)
    return divisors
