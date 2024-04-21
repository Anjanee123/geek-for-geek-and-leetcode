class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum[]= new int[2];
        sum[0]=sum[1]=-1;
        for(int i=0; i<nums.length; i++){
            
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    sum[0]=i;
                    sum[1]=j;
                    return sum;
                }
            }
        }
        return sum;

        
    }
}