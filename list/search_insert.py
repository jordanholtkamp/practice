class Solution(object):
    def searchInsert(nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        i = 0
        if target in nums: return nums.index(target)
        elif target < nums[0]: return 0
        elif target > nums[-1]: return len(nums)
        else:
            while i < len(nums):
                if target > nums[i] and target < nums[i+1]:
                    return i+1
                i+=1


    if __name__ == '__main__':
        print(searchInsert([1,3,5,6], 2))
        print(searchInsert([1,3,5,6], 7))
        print(searchInsert([1,3,5,6], 5))