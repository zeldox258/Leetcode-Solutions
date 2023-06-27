
class Solution {
    public int[] prevPermOpt1(int[] arr) {
        int n=arr.length;
        for(int i=n-2;i>=0;i--){if(arr[i]>arr[i+1]){int j=n-1;while(arr[j]>=arr[i])j--;while(j>0&&arr[j-1]==arr[j])j--;int t=arr[i];arr[i]=arr[j];arr[j]=t;break;}}
        return arr;
    }
}
