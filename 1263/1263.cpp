class Solution {
public:
    int minimumMovesToMoveABoxToTheirT(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumMovesToMoveABoxToTheirT(root->left),minimumMovesToMoveABoxToTheirT(root->right));
    }
};