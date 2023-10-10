class Solution {
public:
    int returnLengthOfArgumentsPassed(TreeNode* root) {
        if(!root) return 0;
        return 1+max(returnLengthOfArgumentsPassed(root->left),returnLengthOfArgumentsPassed(root->right));
    }
};