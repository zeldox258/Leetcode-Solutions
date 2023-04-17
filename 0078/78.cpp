class Solution {
public:
    int subsets(TreeNode* root) {
        if(!root) return 0;
        return 1+max(subsets(root->left),subsets(root->right));
    }
};