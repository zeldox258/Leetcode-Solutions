class Solution {
public:
    int largestSumOfAverages(TreeNode* root) {
        if(!root) return 0;
        return 1+max(largestSumOfAverages(root->left),largestSumOfAverages(root->right));
    }
};