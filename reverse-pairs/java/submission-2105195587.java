class Solution {
    static int cnt = 0;

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

    public static void countPairs(int[] nums, int low, int mid, int high){
        int right = mid+1;
        for(int i=low;i<=mid;i++){
            while(right<=high && (long) nums[i] > 2L * nums[right]){
                right++;
            }
            cnt += (right - (mid+1));
        }
    }

    public static void mergeSort(int[] nums, int low, int high){
        if(low>=high) return;
        int mid = low + (high-low) / 2;
        mergeSort(nums,low,mid); // left half
        mergeSort(nums,mid+1,high); // right half
        countPairs(nums, low, mid, high);
        merge(nums,low,mid,high); // merging sorted halves

    }

    public int reversePairs(int[] nums) {
        cnt = 0;

        int n = nums.length;
        mergeSort(nums,0,n-1);
        return cnt;
    }
}