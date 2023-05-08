def reverse_vowels(s):
    vowel_list = 'aeiouAEIOU'
    only_vowels = []
    # take the vowels out, store the index
    i = 0
    while i < len(s):
        if s[i] in vowel_list:
            only_vowels.append(s[i])
            s = s.replace(s[i], "-", 1)
        i += 1


    reversed = only_vowels[::-1]
    j = 0

    for letter in s:
        if letter == "-":
            s = s.replace("-", reversed[j], 1)
            j += 1
    return s


# print(reverse_vowels("hello"))
print(reverse_vowels("leetcode"))