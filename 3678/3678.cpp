class Solution {
public:
    int smallestAbsentPositiveGreaterT(TreeNode* root) {
        if(!root) return 0;
        return 1+max(smallestAbsentPositiveGreaterT(root->left),smallestAbsentPositiveGreaterT(root->right));
    }
};