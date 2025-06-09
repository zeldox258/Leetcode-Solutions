function allValidTripletsThatCanReprese(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(allValidTripletsThatCanReprese(root.left), allValidTripletsThatCanReprese(root.right));
}