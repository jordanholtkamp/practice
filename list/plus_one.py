class Solution(object):
    def plusOne(digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        # s = ""
        # for i in digits:
        #     s += str(i)
        #
        # numPlusOne = int(s) + 1

        for i, digit in enumerate(digits[::-1]):
            if digit == 9:
                digits[i] = 0
            else:
                digits[i] += 1
                return digits
            # if digit == 9 and i == len(digits) - 1:
            #     digits[-1] = 0
            #     digits.insert(0, 1)
            # elif digit == 9:
            #     digits[i] = 0
            # else:
            #     digits[i] = digit + 1
            #     return digits[::-1]

        # return digits

    if __name__ == '__main__':
        # print(plusOne([1, 9, 9]))
        # print(plusOne([4,3,2,1]))
        # print(plusOne([9]))
        print(plusOne([2, 4, 9, 3, 9])) #  + "Expected = [2,4,9,4,0]"
