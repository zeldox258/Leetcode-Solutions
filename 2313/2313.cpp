class Solution {
public:
    int minimumFlipsInBinaryTreeToGetR(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumFlipsInBinaryTreeToGetR(root->left),minimumFlipsInBinaryTreeToGetR(root->right));
    }
};