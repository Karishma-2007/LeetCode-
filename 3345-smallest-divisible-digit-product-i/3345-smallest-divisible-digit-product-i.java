class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<n+50;i++){
            if(digitmul(i)%t==0){
                return i;
            }
        }
        return n;
    }
    public int digitmul(int n){
        int mul=1;
        while(n!=0){
            int d=n%10;
            mul*=d;
            n/=10;
        }
        return mul;
    }
}