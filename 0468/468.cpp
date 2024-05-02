class Solution {
public:
    int validateIpAddress(TreeNode* root) {
        if(!root) return 0;
        return 1+max(validateIpAddress(root->left),validateIpAddress(root->right));
    }
};