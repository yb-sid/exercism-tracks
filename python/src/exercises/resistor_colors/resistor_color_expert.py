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

tolerance_map = {
    "grey": "0.05",
    "violet": "0.1",
    "blue": "0.25",
    "green": "0.5",
    "brown": "1",
    "red": "2",
    "gold": "5",
    "silver": "10",
}

FACTOR_MAP = {
    "gigaohms": 1_000_000_000,
    "megaohms": 1_000_000,
    "kiloohms": 1_000,
    "ohms": 1,
}


def get_decimal_value(digit_value, power_factor):
    total = digit_value * power_factor
    for suffix, factor in FACTOR_MAP.items():
        if total >= factor:
            return total / factor, suffix


def resistor_label(colors):
    if len(colors) == 1:
        return "0 ohms"
    elif len(colors) == 4:
        val = color_map[colors[0]] * 10 + color_map[colors[1]]
        power_suffix = colors[2]
        tolerance_suffix = colors[3]
    elif len(colors) == 5:
        one, two, three, four, five = colors
        val = color_map[one] * 100 + color_map[two] * 10 + color_map[three]
        power_suffix = four
        tolerance_suffix = five
    else:
        return "Invalid input"

    power_factor = 10 ** color_map[power_suffix]
    tolerance = tolerance_map[tolerance_suffix]

    value, suffix = get_decimal_value(val, power_factor)
    return f"{int(value) if int(value) == value else value} {suffix} ±{tolerance}%"
