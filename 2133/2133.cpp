class Solution {
public:
    int checkIfEveryRowAndColumnContai(TreeNode* root) {
        if(!root) return 0;
        return 1+max(checkIfEveryRowAndColumnContai(root->left),checkIfEveryRowAndColumnContai(root->right));
    }
};