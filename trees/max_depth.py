from typing import Optional

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def max_depth(root: Optional[TreeNode]):
    # if not root: return 0
    # count = 1
    # left, right = root.left, root.right
    # while left or right:
    #     count += 1
    #     left, right = left.left, right.right

    if not root:
        return 0
    return max(max_depth(root.left), max_depth(root.right)) + 1

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
rightrightright = TreeNode(6)
root.right.right.right = rightrightright
print(max_depth(root))