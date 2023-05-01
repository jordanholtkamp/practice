class Solution(object):
    def strStr(haystack, needle):
        if needle not in haystack:
            return -1
        return haystack.find(needle)


    if __name__ == '__main__':
        print(strStr("leetcode", "leeto"))
        print(strStr("sadnotsad", "sad"))