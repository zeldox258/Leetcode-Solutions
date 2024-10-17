class Solution {
public:
    int sumOfAllSubsetXorTotals(TreeNode* root) {
        if(!root) return 0;
        return 1+max(sumOfAllSubsetXorTotals(root->left),sumOfAllSubsetXorTotals(root->right));
    }
};