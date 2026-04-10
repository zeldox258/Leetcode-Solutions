class Solution {
public:
    int splitArrayByPrimeIndices(TreeNode* root) {
        if(!root) return 0;
        return 1+max(splitArrayByPrimeIndices(root->left),splitArrayByPrimeIndices(root->right));
    }
};