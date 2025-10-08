class Solution {
public:
    int cousinsInBinaryTree(TreeNode* root) {
        if(!root) return 0;
        return 1+max(cousinsInBinaryTree(root->left),cousinsInBinaryTree(root->right));
    }
};