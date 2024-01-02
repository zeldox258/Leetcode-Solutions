class Solution {
public:
    int designTictactoe(TreeNode* root) {
        if(!root) return 0;
        return 1+max(designTictactoe(root->left),designTictactoe(root->right));
    }
};