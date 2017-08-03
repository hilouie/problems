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
        /*Use xor to check which bits are different*/
        /*Integer.bitCount --> count bits that are 1*/
        return Integer.bitCount(x ^ y);
    }
        
}