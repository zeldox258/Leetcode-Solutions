class Solution {
public:
    int minimumImpossibleOr(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumImpossibleOr(root->left),minimumImpossibleOr(root->right));
    }
};