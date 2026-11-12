class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int[] freq=new int[101];
        for(int i=0;i<nums.length;i++){
            int ind=nums[i];
            freq[ind]++;
        }
        for(int i=0;i<freq.length;i++){
            if(isPrime(freq[i])){
                return true;
            }
        }
        return false;


    }
    private boolean isPrime(int n){
        if(n==0 || n==1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}