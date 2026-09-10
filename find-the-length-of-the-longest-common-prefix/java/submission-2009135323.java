class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        
        // Take a HashSet to store all prefixes from arr1 
        HashSet<Integer> set = new HashSet<>();

        // Add all prefixes one by one
        for(int num: arr1){
            while(num > 0){
                set.add(num);
                num = num / 10;
            }
        }

        int ans = 0;

        // Check prefixes from arr2
        for(int num: arr2){
            while(num>0){
                if(set.contains(num)){
                    ans = Math.max(ans, String.valueOf(num).length());
                    break;
                }
                num = num / 10;
            }
        }

        return ans;


    }
}