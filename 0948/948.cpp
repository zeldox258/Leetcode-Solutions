class Solution {
public:
    int bagOfTokens(TreeNode* root) {
        if(!root) return 0;
        return 1+max(bagOfTokens(root->left),bagOfTokens(root->right));
    }
};