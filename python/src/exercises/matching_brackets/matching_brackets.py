def is_paired(input_string):
    stack = []
    open = "[{("
    close = "]})"
    for ch in input_string:
        if ch in open:
            stack.append(ch)
        if ch in close:
            if not stack:
                return False
            if open.index(stack.pop()) != close.index(ch):
                return False
    return not stack
