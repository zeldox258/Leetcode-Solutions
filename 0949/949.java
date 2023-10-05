
class Solution {
    public String largestTimeFromDigits(int[] arr) {
        int best=-1; int[]perm={0,1,2,3};
        do{ int h=arr[perm[0]]*10+arr[perm[1]],m=arr[perm[2]]*10+arr[perm[3]]; if(h<24&&m<60) best=Math.max(best,h*100+m); }while(nextPerm(perm));
        if(best==-1)return ""; return String.format("%02d:%02d",best/100,best%100);
    }
    boolean nextPerm(int[]a){int i=a.length-2;while(i>=0&&a[i]>=a[i+1])i--;if(i<0)return false;int j=a.length-1;while(a[j]<=a[i])j--;int t=a[i];a[i]=a[j];a[j]=t;for(int l=i+1,r=a.length-1;l<r;l++,r--){t=a[l];a[l]=a[r];a[r]=t;}return true;}
}
