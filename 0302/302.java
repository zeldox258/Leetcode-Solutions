
class Solution {
    public int minArea(char[][] image, int r, int c) {
        int top = r, bottom = r, left = c, right = c;
        top = bsearchRow(image, 0, r, true);
        bottom = bsearchRow(image, r, image.length, false);
        left = bsearchCol(image, 0, c, true);
        right = bsearchCol(image, c, image[0].length, false);
        return (bottom - top) * (right - left);
    }
    int bsearchRow(char[][] img, int lo, int hi, boolean first) {
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            boolean hasOne = false;
            for (char c : img[mid]) if (c == '1') { hasOne = true; break; }
            if (hasOne) { if (first) hi = mid; else lo = mid + 1; }
            else { if (first) lo = mid + 1; else hi = mid; }
        }
        return lo;
    }
    int bsearchCol(char[][] img, int lo, int hi, boolean first) {
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            boolean hasOne = false;
            for (char[] row : img) if (row[mid] == '1') { hasOne = true; break; }
            if (hasOne) { if (first) hi = mid; else lo = mid + 1; }
            else { if (first) lo = mid + 1; else hi = mid; }
        }
        return lo;
    }
}
