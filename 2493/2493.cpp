class Solution {
public:
    int divideNodesIntoTheMaximumNumbe(TreeNode* root) {
        if(!root) return 0;
        return 1+max(divideNodesIntoTheMaximumNumbe(root->left),divideNodesIntoTheMaximumNumbe(root->right));
    }
};