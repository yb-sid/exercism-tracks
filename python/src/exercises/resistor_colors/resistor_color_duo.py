from resistor_color import color_map


def value(colors):
    return color_map[colors[0]] * 10 + color_map[colors[1]]


# print(value(["green", "brown", "orange"]))
