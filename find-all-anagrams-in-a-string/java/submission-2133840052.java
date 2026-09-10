class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> ans = new ArrayList<>();

        if(p.length() > s.length()){
            return ans;
        }

        int[] pHash = new int[26];
        int[] sHash = new int[26];

        for(int i=0;i<p.length();i++){
            pHash[p.charAt(i) - 'a']++;
        }

        int l = 0;
        int r = 0;

        while(r < s.length()){
            sHash[s.charAt(r)-'a']++;

            if(r-l+1 == p.length()){
                if(Arrays.equals(pHash, sHash)){
                    ans.add(l);
                }
                sHash[s.charAt(l)-'a']--;
                l++;
            }
            r++;
        }

        return ans;
    }
}