class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] total = new int[code.length];
        total[0] = code[0];
        for(int i =1;i<code.length;i++){
            total[i] = total[i-1]+code[i];
        }

        if(k == 0){
            for(int i =0;i<code.length;i++){
                code[i] = 0;
            }
        }
        else if(k > 0){
            for(int i =0;i<code.length;i++){
                int temp = 0;
                if(i+k >= code.length){
                    temp+= total[total.length-1]-total[i] +total[k-1-(total.length - i - 1)];
                }
                else{
                    temp = total[i+k] - total[i];
                }
                code[i] = temp;
            }
        }
        else{
            for(int i =0;i<total.length;i++){

                int temp = 0;
                if(i+k <0){
                    int tempk = k*-1;
                    temp+=total[i]-code[i]+total[total.length-1] - total[total.length-(tempk-i)-1];
                }
                else if(i+k == 0){
                    temp = total[i-1];
                }
                else{
                    temp = total[i-1] - total[i+k-1];
                }
                code[i] = temp;

            }
        }


        return code;
    }
}