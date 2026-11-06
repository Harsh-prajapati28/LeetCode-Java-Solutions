class Solution {
    public int missingNumber(int[] nums) {
        int expectedXor=0;
        int n=nums.length;
        for(int i=1;i<=n;i++){
            expectedXor^=i;
        }
        int xor=0;
        for(int i=0;i<n;i++){
            xor^=nums[i];
        }
        return expectedXor^xor;
    }
}