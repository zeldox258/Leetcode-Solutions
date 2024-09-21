class Solution {
public:
    int earliestSecondToMarkIndicesI(TreeNode* root) {
        if(!root) return 0;
        return 1+max(earliestSecondToMarkIndicesI(root->left),earliestSecondToMarkIndicesI(root->right));
    }
};