class Solution {
public:
    int maximumLinearStockScore(TreeNode* root) {
        if(!root) return 0;
        return 1+max(maximumLinearStockScore(root->left),maximumLinearStockScore(root->right));
    }
};