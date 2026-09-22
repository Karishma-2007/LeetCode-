class Solution {
    public void sortColors(int[] nums) {
        int cnt0=0;
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                cnt0++;
            }else if(nums[i]==1){
                cnt1++;
            }else{
                cnt2++;
            }
        }
        int k=0;
        for(int i=0;i<cnt0;i++){
            nums[k]=0;
            k++;
        }
        for(int i=0;i<cnt1;i++){
            nums[k]=1;
            k++;
        }
        for(int i=0;i<cnt2;i++){
            nums[k]=2;
            k++;
        }
    }
}