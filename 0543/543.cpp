class Solution {
public:
    int diameterOfBinaryTree(TreeNode* root) {
        if(!root) return 0;
        return 1+max(diameterOfBinaryTree(root->left),diameterOfBinaryTree(root->right));
    }
};