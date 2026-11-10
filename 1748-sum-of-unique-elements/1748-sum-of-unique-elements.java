class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        int curr=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                curr=nums[i];
                i++;
            }
            else if(curr!=nums[i]){
                sum+=nums[i];
            }
        }
        if(curr!=nums[nums.length-1]){
            sum+=nums[nums.length-1];
        }
        return sum;
    }
}