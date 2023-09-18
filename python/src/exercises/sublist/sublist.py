"""
This exercise stub and the test suite contain several enumerated constants.

Enumerated constants can be done with a NAME assigned to an arbitrary,
but unique value. An integer is traditionally used because it’s memory
efficient.
It is a common practice to export both constants and functions that work with
those constants (ex. the constants in the os, subprocess and re modules).

You can learn more here: https://en.wikipedia.org/wiki/Enumerated_type
"""

SUBLIST = -1
SUPERLIST = -2
EQUAL = -3
UNEQUAL = -4


def sublist(one, two):
    txt1 = str(one).strip("[]") + ","
    txt2 = str(two).strip("[]") + ","

    if one == two:
        return EQUAL
    if txt2 in txt1:
        return SUPERLIST
    if txt1 in txt2:
        return SUBLIST
    return UNEQUAL
