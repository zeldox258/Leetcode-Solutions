class Solution {
public:
    int validParenthesisString(TreeNode* root) {
        if(!root) return 0;
        return 1+max(validParenthesisString(root->left),validParenthesisString(root->right));
    }
};