class Solution {
public:
    int deepObjectFilter(TreeNode* root) {
        if(!root) return 0;
        return 1+max(deepObjectFilter(root->left),deepObjectFilter(root->right));
    }
};