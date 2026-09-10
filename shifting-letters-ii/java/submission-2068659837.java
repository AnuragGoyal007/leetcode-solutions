class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        char[] arr = s.toCharArray();

        int diff[] = new int[arr.length+1];

        for(int shift[]: shifts){
            int start = shift[0];
            int end = shift[1];
            int step = shift[2];

            int value = (step==1) ? 1 : -1;

            diff[start] += value;
            diff[end+1] -= value;
        }

        int currShift = 0;

        for(int i=0;i<arr.length;i++){
            currShift += diff[i];

            int shifted = (arr[i]-'a' + currShift) % 26;

            if(shifted<0)
                shifted += 26;

            arr[i] = (char) ('a'+shifted);
        }
        return new String(arr);
    }
}