class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] arr = s.toCharArray();

        int shift = 0;
        for(int i=arr.length-1;i>=0;i--){
            shift = (shift + shifts[i]) % 26;

            int pos = arr[i] - 'a';
            pos = (pos + shift) % 26;

            arr[i] = (char)('a' + pos);
        }

        return new String(arr);
    }
}