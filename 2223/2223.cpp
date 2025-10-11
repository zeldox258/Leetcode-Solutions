class Solution {
public:
    int sumOfScoresOfBuiltStrings(TreeNode* root) {
        if(!root) return 0;
        return 1+max(sumOfScoresOfBuiltStrings(root->left),sumOfScoresOfBuiltStrings(root->right));
    }
};