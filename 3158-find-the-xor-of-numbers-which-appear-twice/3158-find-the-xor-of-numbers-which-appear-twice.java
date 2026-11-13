class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int[] freq=new int[50];
        for(int i=0;i<nums.length;i++){
            int ind=nums[i]-1;
            freq[ind]++;
        }
       int xor=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==2){
                xor^=i+1;
            }
        }
        return xor;
    }
}