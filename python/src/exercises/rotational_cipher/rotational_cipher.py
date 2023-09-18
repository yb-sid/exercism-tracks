def rotate(text: str, key):
    cipher = ""
    for char in text:
        if char.lower().isalpha():
            check = char.isupper()
            ascii = ord(char.lower()) + key
            if ascii > 122:
                ascii -= 26
            up = chr(ascii)
            cipher += up.upper() if check else up

        else:
            cipher += char
    return cipher
