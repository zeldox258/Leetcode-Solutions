class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<digits.length;i++){
            int a=digits[i];
            if(digits[i]!=0){
                for(int j=0;j<digits.length;j++){
                    int b=digits[j];
                    if(i!=j){
                        for(int k = 0; k <digits.length; k++){
                            int c =digits[k];
                            if(i!=k && j!=k && digits[k]%2==0){
                                set.add(a *100+b*10+c);
                            }
                        }
                    }
                }
            }
        }
        return set.size();

    }
}