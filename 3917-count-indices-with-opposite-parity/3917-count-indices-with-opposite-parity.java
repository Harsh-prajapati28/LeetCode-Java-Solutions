class Solution {
    public int[] countOppositeParity(int[] nums) {
        int[] ans=new int[nums.length];
        int even=0;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]%2 !=0){
                ans[i]=even;
            }
            else{
                int odd=(nums.length-i-1)-even;
                ans[i]=odd;
                even++;
            }
        }
        return ans;
    }
}