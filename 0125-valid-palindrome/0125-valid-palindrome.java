class Solution {
    public boolean isPalindrome(String s) {
        String S=s.toLowerCase().replaceAll("[^a-z0-9]+","");
        int l=0;
        int r=S.length()-1;
        while(l<r){
            if(S.charAt(l)==S.charAt(r)){
                l++;
                r--;
            }else{
                return false;
            }
        }
        return true;
    }
}