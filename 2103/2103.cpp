class Solution {
public:
    int ringsAndRods(TreeNode* root) {
        if(!root) return 0;
        return 1+max(ringsAndRods(root->left),ringsAndRods(root->right));
    }
};