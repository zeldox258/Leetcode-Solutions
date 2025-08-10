class Solution {
    public boolean canWin(String currentState) {
        char[] arr=currentState.toCharArray();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]=='+'&&arr[i+1]=='+'){arr[i]=arr[i+1]='-';if(!canWin(new String(arr)))return true;arr[i]=arr[i+1]='+';}
        }
        return false;
    }
}