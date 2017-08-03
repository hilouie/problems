/*Get LCP(LCP(LCP(S1,S2),S3)....Sn)*/

public String longestCommonPrefix(String[] strs) {
	//return empty string if array is empty*/
    if (strs.length == 0) return "";

    /*Using the first word in array as base case*/
    String prefix = strs[0];

    /*iterate through the array*/
    for (int i = 1; i < strs.length; i++)
    	/*indexof returns 0 if the words are exactly the same*/
    	/*returns -1 if the word is not*/
    	/*checks to see if the word is the same*/	
        while (strs[i].indexOf(prefix) != 0) {
        	/*if not shorten the prefix and check again*/
            prefix = prefix.substring(0, prefix.length() - 1);
            /*if its shorten to the point where the prefix become empty
            **then that means the words are completely different and there
            **is not LCP*/
            if (prefix.isEmpty()) return "";
        }        
    return prefix;
}