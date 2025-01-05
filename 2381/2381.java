class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        char arr[]=s.toCharArray();
        int[] map=new int[arr.length+1];
        for(int[] num:shifts){
            if(num[2]==0){
                map[num[0]]-=1;
                map[num[1]+1]+=1;
            }else{
                map[num[0]]+=1;
                map[num[1]+1]-=1;
            }
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=map[i];
            int n=((arr[i]-'a')+sum)%26;
            if(n<0) n+=26;
            arr[i]=(char)(n+'a');
        }
        return new String(arr);
    }
}