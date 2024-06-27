
class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i += 2*k) {
            int l = i, r = Math.min(i+k-1, arr.length-1);
            while (l < r) { char tmp=arr[l]; arr[l++]=arr[r]; arr[r--]=tmp; }
        }
        return new String(arr);
    }
}
