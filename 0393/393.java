
class Solution {
    public boolean validUtf8(int[] data) {
        int count=0;
        for(int d:data){
            d&=0xFF;
            if(count==0){
                if((d>>7)==0) count=0;
                else if((d>>5)==0b110) count=1;
                else if((d>>4)==0b1110) count=2;
                else if((d>>3)==0b11110) count=3;
                else return false;
            } else { if((d>>6)!=0b10) return false; count--; }
        }
        return count==0;
    }
}
