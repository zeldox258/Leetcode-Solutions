class Solution {
public:
    int totalWavinessOfNumbersInRangeI(TreeNode* root) {
        if(!root) return 0;
        return 1+max(totalWavinessOfNumbersInRangeI(root->left),totalWavinessOfNumbersInRangeI(root->right));
    }
};