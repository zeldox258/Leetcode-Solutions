class Solution {
public:
    int maximizeSumOfSquaresOfDigits(TreeNode* root) {
        if(!root) return 0;
        return 1+max(maximizeSumOfSquaresOfDigits(root->left),maximizeSumOfSquaresOfDigits(root->right));
    }
};