class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i = 0, j = 0;
        int n1 = str1.length();
        int n2 = str2.length();

        while(i < n1 && j < n2){
            if((str2.charAt(j) - str1.charAt(i) + 26) % 26 <= 1)
                j++;

            i++;
        }
        return j == n2;
    }
}