public class Solution {
    public int MaximizeTheBeautyOfTheGarden(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MaximizeTheBeautyOfTheGarden(root.left), MaximizeTheBeautyOfTheGarden(root.right));
    }
}