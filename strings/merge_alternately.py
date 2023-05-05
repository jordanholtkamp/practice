def mergeAlternately(word1, word2):
    # find the length of each word
    new_str = ""
    while word1 or word2:
        if word1 and word2:
            new_str += word1[0]
            new_str += word2[0]
            word1 = word1[1:]
            word2 = word2[1:]
        elif word1:
            new_str += word1
            word1 = None
        elif word2:
            new_str += word2
            word2 = None
    return new_str



word1= "abc"
word2 = "pqr"

if mergeAlternately(word1, word2) == "apbqcr":
    print("well done")
else:
    print("poorly done: ", mergeAlternately(word1, word2))

print(mergeAlternately("ab", "pqrs"))