class Solution {
    public int reverseNumber(int x){
        int revNum=0;
        if(x==0)return revNum;
        while(x>0){
            int digit=x%10;
            revNum=revNum*10+digit;
            x=x/10;
        }
        return revNum;
    }
    public boolean isPalindrome(int x) {
       int revNum=reverseNumber(x);
       return (revNum==x);
    }
}