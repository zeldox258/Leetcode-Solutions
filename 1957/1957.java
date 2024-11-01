class Solution {
    public String makeFancyString(String s) {
        char[] a = s.toCharArray();
        int i = 1;
        for (int j = 1, count = 1; j < a.length; j++) {
            count = a[j] == a[j - 1] ? count + 1 : 1;
            if (count < 3)
                a[i++] = a[j];
        }
        return new String(a, 0, i);

    }
}