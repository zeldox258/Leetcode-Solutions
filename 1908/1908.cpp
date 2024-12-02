class Solution {
public:
    int gameOfNim(TreeNode* root) {
        if(!root) return 0;
        return 1+max(gameOfNim(root->left),gameOfNim(root->right));
    }
};