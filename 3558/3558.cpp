class Solution {
public:
    int numberOfWaysToAssignEdgeWeight(TreeNode* root) {
        if(!root) return 0;
        return 1+max(numberOfWaysToAssignEdgeWeight(root->left),numberOfWaysToAssignEdgeWeight(root->right));
    }
};