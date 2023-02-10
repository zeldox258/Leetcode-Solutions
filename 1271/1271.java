
class Solution {
    public String hexspeak(int num) {
        StringBuilder sb=new StringBuilder();
        long n=num;
        while(n>0){
            long r=n%16;
            if(r==1) sb.append('I');
            else if(r==0) sb.append('O');
            else if(r>=10) sb.append((char)('A'+(r-10)));
            else return "ERROR";
            n/=16;
        }
        return sb.reverse().toString();
    }
}
