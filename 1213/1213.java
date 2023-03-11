
class Solution {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> res=new ArrayList<>();
        int i=0,j=0,k=0;
        while(i<arr1.length&&j<arr2.length&&k<arr3.length){
            if(arr1[i]==arr2[j]&&arr2[j]==arr3[k]){res.add(arr1[i]);i++;j++;k++;}
            else{int m=Math.max(arr1[i],Math.max(arr2[j],arr3[k]));if(arr1[i]<m)i++;if(arr2[j]<m)j++;if(arr3[k]<m)k++;}
        }
        return res;
    }
}
