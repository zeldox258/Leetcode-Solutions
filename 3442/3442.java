class Solution {
    public int maxDifference(String s) {
        int ohf = Integer.MIN_VALUE, elf = Integer.MAX_VALUE;
        int[] freq = new int[26];
        
        for(char ch : s.toCharArray()) {
            int i = (int) (ch) - 97;
            freq[i]++;
        }

        for(int x : freq) {
            if(x % 2 == 0 && x < elf && x != 0) elf = x;
            else if(x % 2 != 0 && x > ohf) ohf = x;
        }

        return ohf - elf;
    }
}