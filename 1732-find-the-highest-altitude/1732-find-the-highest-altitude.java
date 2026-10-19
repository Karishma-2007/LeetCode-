class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int[] a=new int[n];
        a[0]=gain[0];
        for(int i=1;i<n;i++){
            a[i]=a[i-1]+gain[i];
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(a[i],max);
            if(max<0){
                max=0;
            }
        }
        return max;
    }
}