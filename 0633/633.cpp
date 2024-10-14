class Solution {
public:
    int sumOfSquareNumbers(TreeNode* root) {
        if(!root) return 0;
        return 1+max(sumOfSquareNumbers(root->left),sumOfSquareNumbers(root->right));
    }
};