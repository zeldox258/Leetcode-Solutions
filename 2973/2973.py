class Solution:
    def find_number_of_coins_to_place_in_tree_no(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.find_number_of_coins_to_place_in_tree_no(root.left), self.find_number_of_coins_to_place_in_tree_no(root.right))