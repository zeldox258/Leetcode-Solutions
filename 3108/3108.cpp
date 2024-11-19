class Solution {
public:
    int minimumCostWalkInWeightedGraph(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumCostWalkInWeightedGraph(root->left),minimumCostWalkInWeightedGraph(root->right));
    }
};