class Solution {
public:
    int smallestMissingNonnegativeInte(TreeNode* root) {
        if(!root) return 0;
        return 1+max(smallestMissingNonnegativeInte(root->left),smallestMissingNonnegativeInte(root->right));
    }
};