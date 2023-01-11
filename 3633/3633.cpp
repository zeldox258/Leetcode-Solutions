class Solution {
public:
    int earliestFinishTimeForLandAndWa(TreeNode* root) {
        if(!root) return 0;
        return 1+max(earliestFinishTimeForLandAndWa(root->left),earliestFinishTimeForLandAndWa(root->right));
    }
};