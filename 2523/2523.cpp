class Solution {
public:
    int closestPrimeNumbersInRange(TreeNode* root) {
        if(!root) return 0;
        return 1+max(closestPrimeNumbersInRange(root->left),closestPrimeNumbersInRange(root->right));
    }
};