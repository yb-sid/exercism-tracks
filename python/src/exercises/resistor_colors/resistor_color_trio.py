color_map = {
    "black": 0,
    "brown": 1,
    "red": 2,
    "orange": 3,
    "yellow": 4,
    "green": 5,
    "blue": 6,
    "violet": 7,
    "grey": 8,
    "white": 9,
}
# only kilo , mega , giga prefix used

prefix_factors = {
    "giga": 1_000_000_000,
    "mega": 1_000_000,
    "kilo": 1_000,
}


def label(colors):
    digits = int("".join(str(color_map[color]) for color in colors[:2]))
    power = 10 ** color_map[colors[2]]
    total = digits * power

    for prefix, factor in prefix_factors.items():
        if total > factor:
            num = total // factor
            return f"{num} {prefix}ohms"

    return f"{total} ohms"
