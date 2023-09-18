def is_armstrong_number(number):
    digits = []
    num = number
    count = 0
    while num>0:
        digit = num%10
        count+=1
        digits.append(digit)
        num = num//10
    

    digits = list(map(lambda x:x**count, digits))
    total = sum(digits)
    return total == number

#print(is_armstrong_number(153))