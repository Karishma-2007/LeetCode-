class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                a.add(i);
            }
        }
        return a;
    }
}