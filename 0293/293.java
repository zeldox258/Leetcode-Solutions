import java.util.*;
class Solution {
    public List<String> generatePossibleNextMoves(String currentState) {
        List<String> res=new ArrayList<>();
        char[] arr=currentState.toCharArray();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]=='+'&&arr[i+1]=='+'){arr[i]='-';arr[i+1]='-';res.add(new String(arr));arr[i]='+';arr[i+1]='+';}
        }
        return res;
    }
}