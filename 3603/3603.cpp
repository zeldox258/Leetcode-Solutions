class Solution {
public:
    int minimumCostPathWithAlternating(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumCostPathWithAlternating(root->left),minimumCostPathWithAlternating(root->right));
    }
};