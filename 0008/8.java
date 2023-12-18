class Solution {
    public int myAtoi(String str) {
        int result =0;
        List<String> list = new ArrayList<>();
        int minus =0;
        int plus =0;
        int index =-1;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) == '-'){
                if(minus == 0 && index ==-1 && plus ==0) minus++;
                else break;
            }
            else if(str.charAt(i) == '+'){
                if(plus == 0 && index ==-1 && minus==0) plus++;
                else break;
            }
            else if(str.charAt(i) == ' '){
                if(index!=-1 || minus!=0 || plus!=0) break;
            }
            else if(isnumber(str.charAt(i))) {
                list.add(Character.toString(str.charAt(i)));
                index = i;
            }
            else break;
        }
       if(list.size() == 0 ) return 0;
        for(int i =0;i<list.size();i++){
            if(result > 214748364){
                if(minus == 1)return -2147483648;
                   else return 2147483647;

            }
            else if(result ==214748364) {
                if(i==list.size() -1 && Integer.parseInt(list.get(i)) ==8 && minus ==1){
                    return -2147483648;
                }
                else if(i==list.size() -1 && Integer.parseInt(list.get(i)) <=7){
                    result*=10;
                    result+=Integer.parseInt(list.get(i));
                    break;
                }
                else{
                    if(minus == 1)return -2147483648;
                   else return 2147483647;
                   }
                }
            result*=10;
            result+=Integer.parseInt(list.get(i));
        }
        if(minus!=1)return result;
        else return -1* result;

    }
    boolean isnumber(char c){
        if(c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9')                  return true;
        return false;
    }
}