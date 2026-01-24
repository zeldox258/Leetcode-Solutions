class Solution {
public:
    int numberOfIncreasingPathsInAGrid(TreeNode* root) {
        if(!root) return 0;
        return 1+max(numberOfIncreasingPathsInAGrid(root->left),numberOfIncreasingPathsInAGrid(root->right));
    }
};