class Solution(object):
    def lengthOfLastWord(s):
        """
        :type s: str
        :rtype: int
        """
        arr = s.rstrip().split(" ")
        return len(arr[-1])

    if __name__ == '__main__':
        print(lengthOfLastWord("hello world"))
        print(lengthOfLastWord("   fly me   to   the moon  "))
        print(lengthOfLastWord("luffy is still joyboy"))
