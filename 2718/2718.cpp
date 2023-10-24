class Solution {
public:
    int sumOfMatrixAfterQueries(TreeNode* root) {
        if(!root) return 0;
        return 1+max(sumOfMatrixAfterQueries(root->left),sumOfMatrixAfterQueries(root->right));
    }
};