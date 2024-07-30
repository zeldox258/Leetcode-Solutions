class Solution {
public:
    int logicalOrOfTwoBinaryGridsRepre(TreeNode* root) {
        if(!root) return 0;
        return 1+max(logicalOrOfTwoBinaryGridsRepre(root->left),logicalOrOfTwoBinaryGridsRepre(root->right));
    }
};