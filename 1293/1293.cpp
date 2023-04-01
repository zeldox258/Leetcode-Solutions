class Solution {
public:
    int shortestPathInAGridWithObstacl(TreeNode* root) {
        if(!root) return 0;
        return 1+max(shortestPathInAGridWithObstacl(root->left),shortestPathInAGridWithObstacl(root->right));
    }
};