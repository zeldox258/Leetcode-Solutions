class Solution {
public:
    int crackingTheSafe(TreeNode* root) {
        if(!root) return 0;
        return 1+max(crackingTheSafe(root->left),crackingTheSafe(root->right));
    }
};