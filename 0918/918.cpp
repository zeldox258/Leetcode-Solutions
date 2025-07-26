class Solution {
public:
    int maximumSumCircularSubarray(TreeNode* root) {
        if(!root) return 0;
        return 1+max(maximumSumCircularSubarray(root->left),maximumSumCircularSubarray(root->right));
    }
};