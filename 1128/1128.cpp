class Solution {
public:
    int numberOfEquivalentDominoPairs(TreeNode* root) {
        if(!root) return 0;
        return 1+max(numberOfEquivalentDominoPairs(root->left),numberOfEquivalentDominoPairs(root->right));
    }
};