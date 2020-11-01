def digit_counter(number):
    counter = 0
    while number > 0:
        if number < 1:
            break
        counter += 1
        number /= 10
    return counter

number = int(input())
