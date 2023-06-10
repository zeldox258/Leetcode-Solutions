
class Solution {
    public int[] addNegabinary(int[] arr1, int[] arr2) {
        java.util.LinkedList<Integer> res=new java.util.LinkedList<>(); int i=arr1.length-1,j=arr2.length-1,carry=0;
        while(i>=0||j>=0||carry!=0){int sum=carry;if(i>=0)sum+=arr1[i--];if(j>=0)sum+=arr2[j--];res.addFirst(((sum%2)+2)%2);carry=-(sum-res.peekFirst())/2;}
        while(res.size()>1&&res.peekFirst()==0)res.removeFirst(); return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
