class Solution {
public:
    int findActiveUsers(TreeNode* root) {
        if(!root) return 0;
        return 1+max(findActiveUsers(root->left),findActiveUsers(root->right));
    }
};