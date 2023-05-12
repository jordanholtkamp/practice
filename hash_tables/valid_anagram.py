def valid_anagram(s, t):
    if len(s) != len(t): return False
    for char in s:
        t = t.replace(char, '', 1)
    return False if t else True

print(valid_anagram("anagram", "nagaram"))
print(valid_anagram('racer', 'racar'))