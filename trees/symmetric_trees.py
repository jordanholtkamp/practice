from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def isSymmetric(root: Optional[TreeNode]):
    stack = []
    if root: stack.append([root.left, root.right])
    while len(stack) > 0:
        left, right = stack.pop()
        if left and right:  # left is 2 node, right is 2 node
            if left.val != right.val:return False
            stack.append([left.left, right.right])
            stack.append([left.right, right.left])
        elif left or right: return False
    return True

    # create a stack appending the left and right nodes
    # say while that stack has something in it, we loop
    # pop the first list off and say thats left and right
    # return false if they are not equal
    # append the outside nodes as a pair and the inside nodes as another pair and continue the loop until it is
    # empty, they aren't equal or there is one and not the other

    # stack = []
    # if root: stack.append([root.left, root.right])
    #
    # while(len(stack) > 0):
    #     left, right = stack.pop()
    #     if left and right:
    #         if left.val != right.val: return False
    #         stack.append([left.left, right.right])
    #         stack.append([left.right, right.left])
    #     elif left or right: return False
    #
    # return True



    # if no root return True
    # if not root:
    #     return True
    #
    # def isMirror(t1, t2):
    #     # if at least one is None, return if True if they are equal(meaning theyre both none), False if they are not
    #     if not t1 or not t2:
    #         return t2 == t1
    #     # check if val is the same
    #     if t1.val != t2.val: return False
    #     return isMirror(t1.left, t2.right) and isMirror(t1.right, t2.left)
    #
    # return isMirror(root.left, root.right)


root = TreeNode(1)
left = TreeNode(2)
right = TreeNode(2)
root.left = left
root.right = right
left_left = TreeNode()
left_right = TreeNode(3)
right_left = TreeNode()
right_right = TreeNode(3)
root.left.right = left_right
root.right.right = right_right
print(isSymmetric(root))
