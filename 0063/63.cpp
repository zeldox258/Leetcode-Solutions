class Solution {
public:
    int uniquePathsIi(TreeNode* root) {
        if(!root) return 0;
        return 1+max(uniquePathsIi(root->left),uniquePathsIi(root->right));
    }
};