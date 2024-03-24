class Solution {
public:
    int theWordingGame(TreeNode* root) {
        if(!root) return 0;
        return 1+max(theWordingGame(root->left),theWordingGame(root->right));
    }
};