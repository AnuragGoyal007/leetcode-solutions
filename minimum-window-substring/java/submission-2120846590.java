class Solution {
    public String minWindow(String s, String t) {
        int hash[] = new int[256];
        int l = 0; int r = 0; int minLen = Integer.MAX_VALUE; int n = s.length(); int startIdx = -1; int count = 0; int m = t.length();

        for(int i=0;i<m;i++){
            hash[t.charAt(i)]++;
        }
            while(r<n){
                if(hash[s.charAt(r)]>0){
                    count++;
                }
                hash[s.charAt(r)]--;
            while(count==m){
                if(r-l+1 < minLen){
                    minLen = r-l+1;
                    startIdx = l;
                }
                hash[s.charAt(l)]++;
                    if(hash[s.charAt(l)]>0){
                        count--;
                }
                l++;
            }
            r++;
            }
        return startIdx == -1 ? "" : s.substring(startIdx, startIdx + minLen);
    }
}