class Solution {
    public int numberOfSpecialChars(String word) {
        int[] lastLower = new int[26];
        int[] firstUpper = new int[26];

        Arrays.fill(lastLower, -1);
        Arrays.fill(firstUpper, -1);

        // traversing the string
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);

            // check for lowercase letter
            if(Character.isLowerCase(ch)){
                lastLower[ch-'a'] = i;
            }

            // check for uppercase letter
            else{
                int idx = ch-'A';

                // Store only first occurence
                if(firstUpper[idx] == -1){
                    firstUpper[idx] = i;
                }
            }
        }

        int count = 0;

        // special character check
        for(int i=0;i<26;i++){
            if(lastLower[i]!=-1 && firstUpper[i]!=-1 && lastLower[i] < firstUpper[i]){
                count++;
            }
        }

        return count;
    }
}