class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE;
        int n=candies.length;
        for(int i=0;i<n;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }

        int ans=0;
        ArrayList<Boolean>a=new ArrayList<>();
        for(int i=0;i<n;i++){
            ans=candies[i]+extraCandies;
            if(ans>=max){
                a.add(true);
            }else{
                a.add(false);
            }
            ans=0;
        }
        return a;
    }
}