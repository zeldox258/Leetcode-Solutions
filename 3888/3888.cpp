class Solution {
public:
    int minimumOperationsToMakeAllGrid(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumOperationsToMakeAllGrid(root->left),minimumOperationsToMakeAllGrid(root->right));
    }
};