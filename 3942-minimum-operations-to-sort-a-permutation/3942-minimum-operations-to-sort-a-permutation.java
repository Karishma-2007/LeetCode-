class Solution { 
    public int minOperations(int[] nums) { 
        int n = nums.length; 
        if(n==1){
            return 0;
        }
        //find the pos of 0
        int start=0;
        while(nums[start]!=0){
            start++;
        }
        boolean asc=true;
        boolean desc=true;
        //we have to check the circular order
        for(int i=0;i<n;i++){
            int value=nums[(start+i)%n]; //might go out of bounds so using the modulo
            if(value !=i){
                asc=false;
            }
            if(value!=(n-i)%n){
                desc=false;
            }
            if(!asc && !desc){
                return -1;
            }
        }
        if(asc){
            return Math.min(start,n-start+2);
        }
        return Math.min(n-start,start+2);

    } 
}
