class Solution {
public:
    int customersWhoBoughtProductsAAnd(TreeNode* root) {
        if(!root) return 0;
        return 1+max(customersWhoBoughtProductsAAnd(root->left),customersWhoBoughtProductsAAnd(root->right));
    }
};