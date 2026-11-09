class Solution {
    public int sumOfUnique(int[] nums) {
       int sum=0;
        int curr=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1] && curr!=nums[i]){
                sum+=nums[i];
            }
            else{
                curr=nums[i];
            }
        }
        if(nums[nums.length-1]!=curr){
            sum+=nums[nums.length-1];
        }
        return sum;
    }
}