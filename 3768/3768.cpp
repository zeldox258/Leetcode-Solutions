class Solution {
public:
    int minimumInversionCountInSubarra(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumInversionCountInSubarra(root->left),minimumInversionCountInSubarra(root->right));
    }
};