class Solution {
    public int countBinarySubstrings(String s) {
        int prevCount = 0;
        int currCount = 1;
        int ans = 0;

        for(int i=1; i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                currCount++; // same group
            }else{ // group changed now
                ans += Math.min(prevCount, currCount);

                prevCount = currCount;
                currCount = 1;
            }
        }

        // last group comparison
        ans += Math.min(prevCount, currCount);

        return ans;
    }
}