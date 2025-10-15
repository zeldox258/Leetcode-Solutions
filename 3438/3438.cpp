class Solution {
public:
    int findValidPairOfAdjacentDigitsI(TreeNode* root) {
        if(!root) return 0;
        return 1+max(findValidPairOfAdjacentDigitsI(root->left),findValidPairOfAdjacentDigitsI(root->right));
    }
};