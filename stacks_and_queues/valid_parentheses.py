def valid_parentheses(s):
    pairs = {'(': ')', '[': ']', '{': '}'}
    stack = []

    for char in s:
        if char in pairs:  # if char is an open bracket, append to stack
            stack.append(char)
        elif len(stack) == 0 or pairs[stack.pop()] != char:
            # if it is not an opening bracket and stack is empty or it is not the closing of what is in the stack, then return False
            return False
    return len(stack) == 0
    # we know if we removed everything from stack they were all proper pairs


print(valid_parentheses("()[]{}"))
print(valid_parentheses("([)]{}"))