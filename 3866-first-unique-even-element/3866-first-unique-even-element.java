class Solution {
    public int firstUniqueEven(int[] nums) {
        int[]freq=new int[100];
        for(int i=0;i<nums.length;i++){
            int index=nums[i]-1;
            freq[index]++;
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 && freq[nums[i]-1]==1){
                return nums[i];
            }
        }
        return -1;
    }
}