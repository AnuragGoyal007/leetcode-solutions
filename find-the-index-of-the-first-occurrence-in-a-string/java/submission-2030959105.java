class Solution {

    public int strStr(String haystack, String needle){
        return helper(haystack, needle, 0);
    }

    private int helper(String haystack, String needle, int index) {
        if(haystack.length() < needle.length()){
            return -1;
        }

        if(haystack.startsWith(needle)){
            return index;
        }
        return helper(haystack.substring(1), needle, index+1);
    }
}