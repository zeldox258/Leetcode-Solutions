class Solution {
public:
    int maxDotProductOfTwoSubsequences(TreeNode* root) {
        if(!root) return 0;
        return 1+max(maxDotProductOfTwoSubsequences(root->left),maxDotProductOfTwoSubsequences(root->right));
    }
};