class Solution {
public:
    int addEdgesToMakeDegreesOfAllNode(TreeNode* root) {
        if(!root) return 0;
        return 1+max(addEdgesToMakeDegreesOfAllNode(root->left),addEdgesToMakeDegreesOfAllNode(root->right));
    }
};