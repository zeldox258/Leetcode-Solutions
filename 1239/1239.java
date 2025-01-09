class Solution {
     public static int maxLength(List<String> arr) {
        int[] masks = new int[arr.size()];
        int maskDex = 0;
        for (int i = 0; i < arr.size(); i++) {
            String str = arr.get(i);
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                int bit = 1 << (c - 'a');
                if ((masks[maskDex] & bit) > 0) {
                    masks[maskDex] = 0;
                    maskDex--;
                    break;
                }
                masks[maskDex] |= bit;
            }
            maskDex++;
        }
        masks = Arrays.copyOf(masks, maskDex);
        int[] res = {0};
        maxDepth(masks, 0, 0, res);
        return res[0];
    }

    public static void maxDepth(int[] masks, int start, int pathMask, int[] res) {
        if (start == masks.length) {
            res[0] = Math.max(res[0], Integer.bitCount(pathMask));
            return;
        }
        if ((masks[start] & pathMask) == 0) {
            maxDepth(masks, start + 1, pathMask | masks[start], res);
        }
        maxDepth(masks, start + 1, pathMask, res);
    }
}