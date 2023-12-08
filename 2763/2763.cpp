class Solution {
public:
    int sumOfImbalanceNumbersOfAllSuba(TreeNode* root) {
        if(!root) return 0;
        return 1+max(sumOfImbalanceNumbersOfAllSuba(root->left),sumOfImbalanceNumbersOfAllSuba(root->right));
    }
};