class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)-'a'] += 1;
        }

        StringBuilder str = new StringBuilder();
        for (int i = 25; i >= 0; i--) {
            int count = 0;
            if (str.length() < s.length()) {
                while (count < repeatLimit && arr[i] > 0) {
                    str.append((char) (i + 97));
                    count++;
                    arr[i]--;
                }
                if (count == repeatLimit && arr[i] != 0 && i > 0) {
                    int k = i - 1;
                    while (k >= 0 && arr[k] == 0) k--;
                    if (k < 0)
                        break;
                    str.append((char) (k + 97));
                    arr[k]--;
                    i++;
                }
            }
        }

        return str.toString();
    }
}