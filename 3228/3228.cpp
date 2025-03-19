class Solution {
public:
    int maximumNumberOfOperationsToMov(TreeNode* root) {
        if(!root) return 0;
        return 1+max(maximumNumberOfOperationsToMov(root->left),maximumNumberOfOperationsToMov(root->right));
    }
};