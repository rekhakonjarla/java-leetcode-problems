
38. Find the Index of the First Occurrence in a String

solution:-

class Solution {
    public int strStr(String haystack, String needle) {
        int j=0,n=0;
        for(int i=0;i<haystack.length();i++){
            j=0;
            n=i;
            while(j<needle.length() && n<haystack.length() && haystack.charAt(n)==needle.charAt(j))
            {
                n++;
                j++;
            }
            if(j==needle.length())
                return n-(needle.length());   
        }
       return -1;  
    }
}