class Solution {
    public boolean sumOfNumberAndReverse(int num) {
       for(int n=0;n<=num;n++){
        int temp=n;
        int rev=0;
        while(temp>0){
            rev=rev*10+(temp%10);
            temp/=10;    }
        if(n+rev==num)
        return true;     }
       return false;   }   }
