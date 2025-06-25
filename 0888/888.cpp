class Solution {
public:
    int fairCandySwap(TreeNode* root) {
        if(!root) return 0;
        return 1+max(fairCandySwap(root->left),fairCandySwap(root->right));
    }
};