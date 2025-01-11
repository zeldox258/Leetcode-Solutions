class Solution {
public:
    int candyCrush(TreeNode* root) {
        if(!root) return 0;
        return 1+max(candyCrush(root->left),candyCrush(root->right));
    }
};