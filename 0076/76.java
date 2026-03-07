class Solution {
    public String minWindow(String s, String t) {
        int[] need=new int[128];
        for(char c:t.toCharArray()) need[c]++;
        int l=0,r=0,missing=t.length(),start=0,minLen=Integer.MAX_VALUE;
        while(r<s.length()){
            if(need[s.charAt(r++)]-->0) missing--;
            while(missing==0){
                if(r-l<minLen){minLen=r-l;start=l;}
                if(need[s.charAt(l++)]++==0) missing++;
            }
        }
        return minLen==Integer.MAX_VALUE?"":s.substring(start,start+minLen);
    }
}