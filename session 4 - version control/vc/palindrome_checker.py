def digit_counter(number):
    counter = 0
    while number > 0:
        if number < 1:
            break
        counter += 1
        number /= 10
    return counter


def palindrome_checker(number):
    digit_no = digit_counter(number)
    for i in range((digit_no + 1) // 2):
        if ((number // 10 ** (i)) % 10  != (number // 10 **(digit_no - i - 1)) % 10):
            return False
        
    return True


number = int(input())
print(palindrome_checker(number))
