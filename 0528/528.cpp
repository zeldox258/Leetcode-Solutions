class Solution {
public:
    int randomPickWithWeight(TreeNode* root) {
        if(!root) return 0;
        return 1+max(randomPickWithWeight(root->left),randomPickWithWeight(root->right));
    }
};