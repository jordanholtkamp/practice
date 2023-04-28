class Solution(object):
    def removeDuplicates(nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        non_dupes = []
        dashes = []
        count = 0
        for num in nums:
            if num not in non_dupes:
                non_dupes.append(num)
                count += 1
            else:
                dashes.append("_")

        return count, non_dupes

    if __name__ == '__main__':
        print(removeDuplicates([0, 0, 1, 1, 1, 2, 2, 3, 3, 4]))


