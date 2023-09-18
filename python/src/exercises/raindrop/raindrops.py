def convert(number):
    sounds = ""
    if number % 3 == 0:
        sounds += "Pling"
    if number % 5 == 0:
        sounds += "Plang"
    if number % 7 == 0:
        sounds += "Plong"

    return str(number) if len(sounds) == 0 else sounds
