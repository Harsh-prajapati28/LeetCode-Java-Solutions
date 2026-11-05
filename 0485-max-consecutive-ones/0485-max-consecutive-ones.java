class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        boolean sumOn=false;
        int count=0;
        int maxCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                sumOn=true;
            }
            else{
                if(maxCount<count){
                maxCount=count;
            }
                sumOn=false;
                count=0;
            }
            if(sumOn){
                count++;
            }      
        }
        if(sumOn){
            maxCount=Math.max(maxCount,count);
        }
        return maxCount;
    }
}