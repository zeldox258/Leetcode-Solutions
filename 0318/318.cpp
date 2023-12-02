class Solution {
public:
    int maximumProductOfWordLengths(TreeNode* root) {
        if(!root) return 0;
        return 1+max(maximumProductOfWordLengths(root->left),maximumProductOfWordLengths(root->right));
    }
};