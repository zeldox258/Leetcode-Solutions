class Solution {
public:
    int dropMissingData(TreeNode* root) {
        if(!root) return 0;
        return 1+max(dropMissingData(root->left),dropMissingData(root->right));
    }
};