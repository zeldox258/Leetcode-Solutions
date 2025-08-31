class Solution {
    private static final String[] ONES={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    private static final String[] TENS={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    public String numberToWords(int num) {
        if(num==0) return "Zero";
        return helper(num).trim();
    }
    String helper(int n){
        if(n==0) return "";
        if(n<20) return ONES[n]+" ";
        if(n<100) return TENS[n/10]+" "+helper(n%10);
        if(n<1000) return ONES[n/100]+" Hundred "+helper(n%100);
        if(n<1000000) return helper(n/1000)+"Thousand "+helper(n%1000);
        if(n<1000000000) return helper(n/1000000)+"Million "+helper(n%1000000);
        return helper(n/1000000000)+"Billion "+helper(n%1000000000);
    }
}