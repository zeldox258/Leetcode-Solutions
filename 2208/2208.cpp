class Solution {
public:
    int minimumOperationsToHalveArrayS(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumOperationsToHalveArrayS(root->left),minimumOperationsToHalveArrayS(root->right));
    }
};