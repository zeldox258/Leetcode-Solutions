class Solution {
public:
    int 4sum(TreeNode* root) {
        if(!root) return 0;
        return 1+max(4sum(root->left),4sum(root->right));
    }
};