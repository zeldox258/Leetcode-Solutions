class Solution {
public:
    int smallestDivisibleDigitProductI(TreeNode* root) {
        if(!root) return 0;
        return 1+max(smallestDivisibleDigitProductI(root->left),smallestDivisibleDigitProductI(root->right));
    }
};