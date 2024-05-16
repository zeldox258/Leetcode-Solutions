class Solution {
public:
    int smallestGoodBase(TreeNode* root) {
        if(!root) return 0;
        return 1+max(smallestGoodBase(root->left),smallestGoodBase(root->right));
    }
};