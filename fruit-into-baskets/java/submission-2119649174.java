class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int right = 0;
        int maxlen = 0;

        HashMap<Integer, Integer> freq = new HashMap<>();

        while (right < fruits.length) {

            // Add current fruit
            freq.put(fruits[right], freq.getOrDefault(fruits[right], 0) + 1);

            // More than 2 types
            while (freq.size() > 2) {

                freq.put(fruits[left], freq.get(fruits[left]) - 1);

                if (freq.get(fruits[left]) == 0) {
                    freq.remove(fruits[left]);
                }

                left++;
            }

            // Current window is valid
            maxlen = Math.max(maxlen, right - left + 1);

            right++;
        }

        return maxlen;
    }
}