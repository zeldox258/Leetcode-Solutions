class Solution {
    public String removeTrailingZeros(String num) {
        int count = 0;
        int n = num.length();
        for(int i = n-1;i>=0;i--){
            char c = num.charAt(i);
            if(c=='0'){
                count++;
            }
            else{
                break;
            }
        }
        return num.substring(0,n-count);
    }
}