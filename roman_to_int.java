public class Solution {
    public int romanToInt(String s) {
        int[] store = new int[s.length()];
        int result = 0; 
        
        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case 'I':
                    store[i] = 1;
                    break;
                case 'V':
                    store[i] = 5;
                    break;
                case 'X':
                    store[i] = 10;
                    break;
                case 'L':
                    store[i] = 50;
                    break;
                case 'C':
                    store[i] = 100;
                    break;
                case 'D':
                    store[i] = 500;
                    break;
                case 'M':
                    store[i] = 1000;
                    break;
                default:
                    break;
            }
        }
        
        for(int i = 0; i < store.length - 1; i++){
            if(store[i] >= store[i+1]){
                result += store[i];
            }
            else{
                result -= store[i];
            }
        }
        return result + store[store.length - 1];
    }
}