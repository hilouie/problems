/*Determine whether an integer is a palindrome*/


public class Solution {
    public boolean isPalindrome(int x) {
        long result = 0;
        int temp = x;
        
        if(x < 0){
            return false;
        }

        while (temp !=0){
            result = result * 10 + temp % 10;
            
            temp = temp/10;
        }
        
        if((int) result == x){
            return true;
        }
        else{
            return false;
        }
    }
}