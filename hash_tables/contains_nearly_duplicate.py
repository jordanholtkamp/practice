def contains_nearly_duplicate(nums, k):
    d = {}
    for i, num in enumerate(nums):
        if num in d:
            if abs(d[num] - i) <= k: return True
            else: d[num] = i
        else: d[num] = i
    return False

print(contains_nearly_duplicate([1,2,3,1,2,3], 2))
print(contains_nearly_duplicate([1,0,1,1], 1))