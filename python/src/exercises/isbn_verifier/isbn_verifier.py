def is_valid(isbn: str):
    no_dash = isbn.replace("-", "")
    if len(no_dash) != 10:
        return False
    if no_dash[-1] not in "0123456789" and no_dash[-1] != "X":
        return False
    count = 10
    summation = 0
    for char in no_dash[:-1]:
        if char.isdigit():
            summation += int(char) * count
            count -= 1

    if no_dash[-1] == "X":
        summation += 10
    else:
        summation += int(no_dash[-1])

    return summation % 11 == 0


print(is_valid("3-598-21507-X"))
