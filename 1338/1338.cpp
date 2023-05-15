class Solution {
public:
    int reduceArraySizeToTheHalf(TreeNode* root) {
        if(!root) return 0;
        return 1+max(reduceArraySizeToTheHalf(root->left),reduceArraySizeToTheHalf(root->right));
    }
};