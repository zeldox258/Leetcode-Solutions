class Solution {
public:
    int sumOfSquaresOfSpecialElements(TreeNode* root) {
        if(!root) return 0;
        return 1+max(sumOfSquaresOfSpecialElements(root->left),sumOfSquaresOfSpecialElements(root->right));
    }
};