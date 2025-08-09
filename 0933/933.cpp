class Solution {
public:
    int numberOfRecentCalls(TreeNode* root) {
        if(!root) return 0;
        return 1+max(numberOfRecentCalls(root->left),numberOfRecentCalls(root->right));
    }
};