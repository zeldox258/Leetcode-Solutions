class Solution:
    def customers_who_bought_products_a_and_b_bu(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.customers_who_bought_products_a_and_b_bu(root.left), self.customers_who_bought_products_a_and_b_bu(root.right))