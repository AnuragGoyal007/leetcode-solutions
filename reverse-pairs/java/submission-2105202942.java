class Solution {
    // static int cnt = 0;

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];

        int left = low;
        int right = mid + 1;
        int k = 0;

        // Compare elements from both halves
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k] = arr[left];
                left++;
            } else {
                temp[k] = arr[right];
                right++;
            }
            k++;
        }

        // Copy remaining elements from left half
        while (left <= mid) {
            temp[k] = arr[left];
            left++;
            k++;
        }

        // Copy remaining elements from right half
        while (right <= high) {
            temp[k] = arr[right];
            right++;
            k++;
        }

        // Copy sorted elements back into original array
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }

    public static int countPairs(int[] nums, int low, int mid, int high){
        int right = mid+1;
        int cnt = 0;
        for(int i=low;i<=mid;i++){
            while(right<=high && (long) nums[i] > 2L * nums[right]){
                right++;
            }
            cnt += (right - (mid+1));
        }
        return cnt;
    }

    public static int mergeSort(int[] nums, int low, int high){
        int cnt = 0;
        if(low>=high) return cnt;
        int mid = low + (high-low) / 2;
        cnt += mergeSort(nums,low,mid); // left half
        cnt += mergeSort(nums,mid+1,high); // right half
        cnt += countPairs(nums, low, mid, high);
        merge(nums,low,mid,high); // merging sorted halves

        return cnt;
    }

    public int reversePairs(int[] nums) {
        int n = nums.length;
        return mergeSort(nums,0,n-1);
    }
}