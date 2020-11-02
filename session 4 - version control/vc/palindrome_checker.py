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
        left_i = (number // 10 ** (i)) % 10
        right_i = (number // 10 **(digit_no - i - 1)) % 10

        if left_i != right_i:
            return False
        
    return True


number = int(input())
print(palindrome_checker(number))
palindrome_checker(number)

