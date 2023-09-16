
class Solution {
    public java.util.List<Integer> pancakeSort(int[] arr) {
        java.util.List<Integer> res=new java.util.ArrayList<>();
        for(int size=arr.length;size>1;size--){ int maxIdx=0; for(int i=1;i<size;i++) if(arr[i]>arr[maxIdx]) maxIdx=i; if(maxIdx==size-1) continue; if(maxIdx!=0){flip(arr,maxIdx);res.add(maxIdx+1);} flip(arr,size-1);res.add(size); }
        return res;
    }
    void flip(int[]arr,int k){for(int i=0,j=k;i<j;i++,j--){int t=arr[i];arr[i]=arr[j];arr[j]=t;}}
}
