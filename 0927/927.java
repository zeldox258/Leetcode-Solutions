
class Solution {
    public int[] threeEqualParts(int[] arr) {
        int ones=0; for(int v:arr) ones+=v;
        if(ones==0) return new int[]{0,2}; if(ones%3!=0) return new int[]{-1,-1};
        int k=ones/3,cnt=0,i1=-1,i2=-1,i3=-1;
        for(int i=0;i<arr.length;i++) if(arr[i]==1){cnt++;if(cnt==1)i1=i;if(cnt==k+1)i2=i;if(cnt==2*k+1)i3=i;}
        while(i3<arr.length&&arr[i1]==arr[i2]&&arr[i2]==arr[i3]){i1++;i2++;i3++;}
        if(i3==arr.length) return new int[]{i1-1,i2}; return new int[]{-1,-1};
    }
}
