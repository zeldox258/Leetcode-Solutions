class Solution {
public:
    int modifyTheMatrix(TreeNode* root) {
        if(!root) return 0;
        return 1+max(modifyTheMatrix(root->left),modifyTheMatrix(root->right));
    }
};