class Solution {
public:
    int leftmostColumnWithAtLeastAOne(TreeNode* root) {
        if(!root) return 0;
        return 1+max(leftmostColumnWithAtLeastAOne(root->left),leftmostColumnWithAtLeastAOne(root->right));
    }
};