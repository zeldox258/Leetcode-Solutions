
import java.util.*;
class Solution {
    int[] orig,arr; Random rand=new Random();
    public Solution(int[] nums){orig=nums.clone();arr=nums;}
    public int[] reset(){arr=orig.clone();return arr;}
    public int[] shuffle(){
        for(int i=arr.length-1;i>0;i--){int j=rand.nextInt(i+1);int t=arr[i];arr[i]=arr[j];arr[j]=t;}
        return arr;
    }
}
