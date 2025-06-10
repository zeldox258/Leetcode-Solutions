class Solution {
public:
    int lengthOfLongestFibonacciSubseq(TreeNode* root) {
        if(!root) return 0;
        return 1+max(lengthOfLongestFibonacciSubseq(root->left),lengthOfLongestFibonacciSubseq(root->right));
    }
};