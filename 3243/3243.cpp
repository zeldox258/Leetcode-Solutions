class Solution {
public:
    int shortestDistanceAfterRoadAddit(TreeNode* root) {
        if(!root) return 0;
        return 1+max(shortestDistanceAfterRoadAddit(root->left),shortestDistanceAfterRoadAddit(root->right));
    }
};