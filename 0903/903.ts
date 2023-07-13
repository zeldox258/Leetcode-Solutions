function validPermutationsForDiSequence(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(validPermutationsForDiSequence(root.left), validPermutationsForDiSequence(root.right));
}