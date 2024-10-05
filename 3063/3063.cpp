class Solution {
public:
    int linkedListFrequency(TreeNode* root) {
        if(!root) return 0;
        return 1+max(linkedListFrequency(root->left),linkedListFrequency(root->right));
    }
};