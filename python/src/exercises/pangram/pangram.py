def is_pangram(sentence: str):
    letters = [-1] * 26
    # print(letters)
    for char in sentence.strip():
        if char.lower().isalpha():
            lower = char.lower()
            index = ord(lower) - 97
            if letters[index] == -1:
                letters[index] = 1

    # print(letters)
    array_sum = sum(letters)

    return array_sum == 26


# print(is_pangram("The quick brown fox jumps over the lazy dog."))
