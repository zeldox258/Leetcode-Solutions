
class Solution {
    public void duplicateZeros(int[] arr) {
        int n=arr.length,i=0,j=0;
        int[]copy=arr.clone();
        while(j<n){if(copy[i]==0){if(j<n)arr[j++]=0;if(j<n)arr[j++]=0;}else{if(j<n)arr[j++]=copy[i];}i++;}
    }
}
