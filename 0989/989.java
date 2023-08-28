
class Solution {
    public java.util.List<Integer> addToArrayForm(int[] num, int k) {
        java.util.LinkedList<Integer> res=new java.util.LinkedList<>(); int carry=k;
        for(int i=num.length-1;i>=0||carry>0;i--){if(i>=0)carry+=num[i];res.addFirst(carry%10);carry/=10;}
        return res;
    }
}
