class Solution {
public:
    int theMostSimilarPathInAGraph(TreeNode* root) {
        if(!root) return 0;
        return 1+max(theMostSimilarPathInAGraph(root->left),theMostSimilarPathInAGraph(root->right));
    }
};