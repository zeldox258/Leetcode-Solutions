class Solution {
    private char[] buf4=new char[4];
    private int buf4ptr=0,buf4cnt=0;
    public int read(char[] buf, int n) {
        int total=0;
        while(total<n){
            if(buf4ptr==buf4cnt){buf4cnt=read4(buf4);buf4ptr=0;}
            if(buf4cnt==0) break;
            while(total<n&&buf4ptr<buf4cnt) buf[total++]=buf4[buf4ptr++];
        }
        return total;
    }
    int read4(char[] buf4){return 0;}
}