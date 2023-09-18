def is_isogram(string: str):
    memo = set()

    for char in string.lower():
        if char.isalpha() and char in memo:
            return False
        memo.add(char)
    return True
