class Solution {
public:
    int diagonalTraverse(TreeNode* root) {
        if(!root) return 0;
        return 1+max(diagonalTraverse(root->left),diagonalTraverse(root->right));
    }
};