class Solution {
public:
    int findTheLeastFrequentDigit(TreeNode* root) {
        if(!root) return 0;
        return 1+max(findTheLeastFrequentDigit(root->left),findTheLeastFrequentDigit(root->right));
    }
};