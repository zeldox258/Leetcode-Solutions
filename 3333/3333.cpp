class Solution {
public:
    int findTheOriginalTypedStringIi(TreeNode* root) {
        if(!root) return 0;
        return 1+max(findTheOriginalTypedStringIi(root->left),findTheOriginalTypedStringIi(root->right));
    }
};