class Solution {
    public int lengthOfLongestSubstring(String s) {
        int hash[] = new int[256];
        Arrays.fill(hash,-1);
        int l = 0;
        int r = 0;
        int maxLen = 0;
        int n = s.length();

        while(r<n){
            char ch = s.charAt(r);
                if(hash[s.charAt(r)] >= l){
                    l = hash[ch] + 1;
                }
            int len = r-l+1;
            maxLen = Math.max(len,maxLen);
            hash[ch] = r;
            r++;
        }
        return maxLen;
    }
}