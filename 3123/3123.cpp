class Solution {
public:
    int findEdgesInShortestPaths(TreeNode* root) {
        if(!root) return 0;
        return 1+max(findEdgesInShortestPaths(root->left),findEdgesInShortestPaths(root->right));
    }
};