class Solution {
public:
    int findMissingObservations(TreeNode* root) {
        if(!root) return 0;
        return 1+max(findMissingObservations(root->left),findMissingObservations(root->right));
    }
};