class Solution {
public:
    int changeNullValuesInATableToTheP(TreeNode* root) {
        if(!root) return 0;
        return 1+max(changeNullValuesInATableToTheP(root->left),changeNullValuesInATableToTheP(root->right));
    }
};