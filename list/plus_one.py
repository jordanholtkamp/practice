class Solution(object):
    def plusOne(digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """

        strings = ""
        for number in digits:
            strings += str(number)

        temp = str(int(strings) + 1)

        return [int(temp[i]) for i in range(len(temp))]

    if __name__ == '__main__':
        print(plusOne([1, 9, 9]))
        print(plusOne([4,3,2,1]))
        print(plusOne([9]))
        print(plusOne([2, 4, 9, 3, 9])) #  "Expected = [2,4,9,4,0]"
