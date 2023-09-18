def is_all_caps(text: str):
    return text.isupper()


def yell_question(text: str):
    return text.isupper() and text[-1] == "?"


def is_silence(text: str):
    return len(text.strip()) == 0


def response(hey_bob):
    if yell_question(hey_bob):
        return "Calm down, I know what I'm doing!"
    elif is_silence(hey_bob):
        return "Fine. Be that way!"
    elif hey_bob.strip()[-1] == "?":
        return "Sure."
    elif is_all_caps(hey_bob):
        return "Whoa, chill out!"
    else:
        return "Whatever."


# print(response(""))
