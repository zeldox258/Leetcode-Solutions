class Solution {
public:
    int rangeSumQueryImmutable(TreeNode* root) {
        if(!root) return 0;
        return 1+max(rangeSumQueryImmutable(root->left),rangeSumQueryImmutable(root->right));
    }
};