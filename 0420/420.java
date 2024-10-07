
class Solution {
    public int strongPasswordChecker(String password) {
        int n=password.length();
        boolean hasLower=false,hasUpper=false,hasDigit=false;
        for(char c:password.toCharArray()){if(Character.isLowerCase(c))hasLower=true;else if(Character.isUpperCase(c))hasUpper=true;else if(Character.isDigit(c))hasDigit=true;}
        int missing=(hasLower?0:1)+(hasUpper?0:1)+(hasDigit?0:1);
        int replace=0,oneMore=0,twoMore=0;
        int i=2;
        while(i<n){if(password.charAt(i)==password.charAt(i-1)&&password.charAt(i)==password.charAt(i-2)){int len=2;while(i<n&&password.charAt(i)==password.charAt(i-1)){len++;i++;}replace+=len/3;if(len%3==0)oneMore++;else if(len%3==1)twoMore++;} else i++;}
        if(n<6){return Math.max(missing,6-n);}
        else if(n<=20){return Math.max(missing,replace);}
        else{int del=n-20;replace-=Math.min(del,oneMore);replace-=Math.min(Math.max(del-oneMore,0),twoMore*2)/2;replace-=Math.max(del-oneMore-twoMore*2,0)/3;return del+Math.max(missing,replace);}
    }
}
