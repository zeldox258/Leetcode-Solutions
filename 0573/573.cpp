class Solution {
public:
    int squirrelSimulation(TreeNode* root) {
        if(!root) return 0;
        return 1+max(squirrelSimulation(root->left),squirrelSimulation(root->right));
    }
};