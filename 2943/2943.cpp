class Solution {
public:
    int maximizeAreaOfSquareHoleInGrid(TreeNode* root) {
        if(!root) return 0;
        return 1+max(maximizeAreaOfSquareHoleInGrid(root->left),maximizeAreaOfSquareHoleInGrid(root->right));
    }
};