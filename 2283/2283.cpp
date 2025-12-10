class Solution {
public:
    int checkIfNumberHasEqualDigitCoun(TreeNode* root) {
        if(!root) return 0;
        return 1+max(checkIfNumberHasEqualDigitCoun(root->left),checkIfNumberHasEqualDigitCoun(root->right));
    }
};