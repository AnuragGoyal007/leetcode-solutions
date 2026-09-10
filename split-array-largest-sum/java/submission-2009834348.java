class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        
        for(int i=0;i<nums.length;i++) {
        	start = Math.max(start, nums[i]);
        	// in the end of the loop, this will contain the max item from the array
        	end += nums[i];
        }
        
        // Binary Search
        while(start < end) {
        		// try for the middle as potential answer
        	int mid = start + (end - start) / 2;
        	
        	// Calculate how many pieces you can divides this in with this max sum
        	int sum = 0;
        	int pieces = 1;
        	for(int num: nums) {
        		if(sum + num > mid) {
        			// you can't add this in this subarray, make new one
        			sum = num;
        			pieces++;
        		}else {
        			sum += num;
        		}
        	}
        	if(pieces>k) {
        		start = mid+1;
        	}else {
        		end = mid;
        	}
    }
        
        return end; // here start == end
    }
}