class Solution {
public:
    int waterBottles(TreeNode* root) {
        if(!root) return 0;
        return 1+max(waterBottles(root->left),waterBottles(root->right));
    }
};