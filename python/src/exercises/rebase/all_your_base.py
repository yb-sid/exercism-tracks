def rebase(input_base: int, digits: list[int], output_base: int):
    # [101] base 2 = 5 in base 10
    # step 1 : convert to base 10
    if input_base < 2:
        raise ValueError("input base must be >= 2")
    if output_base < 2:
        raise ValueError("output base must be >= 2")
    base10 = 0
    power = 0
    for digit in reversed(digits):
        if digit < 0 or digit >= input_base:
            raise ValueError("all digits must satisfy 0 <= d < input base")
        base10 += digit * (input_base**power)
        power += 1
    # step 2 : convert base10 to output base
    # print("base10 = ", base10)
    base10_copy = base10
    res = []
    while base10 > 0:
        rem = base10 % output_base
        print("rem = ", rem)
        res.append(rem)
        base10 = base10 // output_base
    res.reverse()
    return [0] if base10_copy == 0 else res
