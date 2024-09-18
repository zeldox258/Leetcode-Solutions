class Solution {
public:
    int maximumIceCreamBars(TreeNode* root) {
        if(!root) return 0;
        return 1+max(maximumIceCreamBars(root->left),maximumIceCreamBars(root->right));
    }
};