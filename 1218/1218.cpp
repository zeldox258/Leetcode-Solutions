class Solution {
public:
    int longestArithmeticSubsequenceOf(TreeNode* root) {
        if(!root) return 0;
        return 1+max(longestArithmeticSubsequenceOf(root->left),longestArithmeticSubsequenceOf(root->right));
    }
};