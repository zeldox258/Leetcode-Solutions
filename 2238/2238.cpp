class Solution {
public:
    int numberOfTimesADriverWasAPassen(TreeNode* root) {
        if(!root) return 0;
        return 1+max(numberOfTimesADriverWasAPassen(root->left),numberOfTimesADriverWasAPassen(root->right));
    }
};