class Solution {
public:
    int checkIfAllTheIntegersInARangeA(TreeNode* root) {
        if(!root) return 0;
        return 1+max(checkIfAllTheIntegersInARangeA(root->left),checkIfAllTheIntegersInARangeA(root->right));
    }
};