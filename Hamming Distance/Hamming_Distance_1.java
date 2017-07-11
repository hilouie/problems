/*The Hamming Distance between two integers is the number of positions at which the corresponding bits are different.
**Given two integers x and y, calculate the Hamming distance
**Example:
**Input: x = 1, y = 4
**Output: 2
**Explanation:
**1 = 0001
**4 = 0100
**Bits 0 and 2 are different
*/


import java.lang.*;

public class Solution {
    public int hammingDistance(int x, int y) {
        int iterator; //used to iterate through the bits
        /*bit extracted from x and y*/
        int itx;
        int ity;
        /*used to count how many bits are differet*/
        int count = 0;
        
        /*check which number is bigger*/
        int greater;
        if(x > y){
            greater = x;
        }
        else{
            greater = y;
        }
        
        /*check how many bits*/
        int bit = (int) (Math.log(greater)/Math.log(2));
        /*& each bit of x and y and check if they are the same*/
        for(int i = 0; i < bit + 1; i++){
            itx = x & 1 << i;
            ity = y & 1 << i;
            
            /*if they are not the same increment count*/
            if(itx != ity){
                count++;
            }
        }
        
        return count;
    }
}