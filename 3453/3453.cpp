class Solution {
public:
    int separateSquaresI(TreeNode* root) {
        if(!root) return 0;
        return 1+max(separateSquaresI(root->left),separateSquaresI(root->right));
    }
};