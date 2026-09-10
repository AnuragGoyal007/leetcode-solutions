class Solution {
    public int myAtoi(String s) {
        int index = 0;
        while(index<s.length() && s.charAt(index)==' ') index++;

        int sign = 1;
        if(index<s.length() && (s.charAt(index)=='+' || s.charAt(index)=='-')){
            sign = (s.charAt(index)=='-') ? -1 : 1;
            index++;
        }

        return helper(s,index,0,sign);
    }

        static final int INT_MIN_VAL = Integer.MIN_VALUE;
        static final int INT_MAX_VAL = Integer.MAX_VALUE;
    static int helper(String s, int index, long num, int sign){

        if(index>=s.length() || !Character.isDigit(s.charAt(index)))
            return (int)(sign*num);

        num = num*10 + (s.charAt(index)-'0');

        if(sign*num <= INT_MIN_VAL) return INT_MIN_VAL;
        if(sign*num >= INT_MAX_VAL) return INT_MAX_VAL;

        return helper(s,index+1,num,sign);
    }
}