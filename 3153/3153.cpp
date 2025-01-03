class Solution {
public:
    int sumOfDigitDifferencesOfAllPair(TreeNode* root) {
        if(!root) return 0;
        return 1+max(sumOfDigitDifferencesOfAllPair(root->left),sumOfDigitDifferencesOfAllPair(root->right));
    }
};