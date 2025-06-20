
class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray(); int l=0,r=arr.length-1;
        String vowels="aeiouAEIOU";
        while(l<r){
            while(l<r&&vowels.indexOf(arr[l])<0) l++;
            while(l<r&&vowels.indexOf(arr[r])<0) r--;
            char t=arr[l];arr[l++]=arr[r];arr[r--]=t;
        }
        return new String(arr);
    }
}
