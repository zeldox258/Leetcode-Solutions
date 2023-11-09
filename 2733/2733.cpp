class Solution {
public:
    int neitherMinimumNorMaximum(TreeNode* root) {
        if(!root) return 0;
        return 1+max(neitherMinimumNorMaximum(root->left),neitherMinimumNorMaximum(root->right));
    }
};