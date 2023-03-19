class Solution {
public:
    int longestFibonacciSubarray(TreeNode* root) {
        if(!root) return 0;
        return 1+max(longestFibonacciSubarray(root->left),longestFibonacciSubarray(root->right));
    }
};