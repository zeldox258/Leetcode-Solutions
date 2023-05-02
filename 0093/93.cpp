class Solution {
public:
    int restoreIpAddresses(TreeNode* root) {
        if(!root) return 0;
        return 1+max(restoreIpAddresses(root->left),restoreIpAddresses(root->right));
    }
};