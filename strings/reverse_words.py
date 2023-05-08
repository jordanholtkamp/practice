def reverse_words(s):
    temp = ""
    res = []
    for char in s:
        if char != " ":
            temp += char
        elif temp != "":
            res.append(temp)
            temp = ""
    if temp != "":
        res.append(temp)
    return " ".join(res[::-1])





print(reverse_words("the sky is blue"))
print(reverse_words("   a good   example  "))