class Solution {
    public int compress(char[] chars) {
        int write = 0;int read = 0;

        while(read<chars.length){
            char ch = chars[read];
            int start = read;

            while(read<chars.length && chars[read]==ch)
                read++;

            chars[write++] = ch;

            int count = read-start;

            if(count>1){
                for(char c: String.valueOf(count).toCharArray())
                    chars[write++] = c;
            }
        }
        return write;
    }
}