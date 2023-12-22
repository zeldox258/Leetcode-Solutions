class Solution {
    public int maxScore(String s) {
        int ones = 0;
        int zeros = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '0') zeros++;
            else ones++;
        }
       //System.out.println(ones + " "+zeros);
        int max = 0;
        int temp = 0;
        for(int i =0;i <s.length()-1;i++){
            if(s.charAt(i) == '0') temp++;
            else ones--;
            max = Math.max(max,temp+ones);
        }
        return max;
    }
}