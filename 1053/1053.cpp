class Solution {
public:
    int previousPermutationWithOneSwap(TreeNode* root) {
        if(!root) return 0;
        return 1+max(previousPermutationWithOneSwap(root->left),previousPermutationWithOneSwap(root->right));
    }
};