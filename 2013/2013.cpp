class Solution {
public:
    int detectSquares(TreeNode* root) {
        if(!root) return 0;
        return 1+max(detectSquares(root->left),detectSquares(root->right));
    }
};