/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndexInMountain(mountainArr);

        int firstTry = orderAgnosticBS(mountainArr, target, 0, peak);

        if(firstTry != -1){
            return firstTry;
        }

        return orderAgnosticBS(mountainArr, target, peak+1, mountainArr.length() - 1);
    }

    int peakIndexInMountain(MountainArray arr){
        int start = 0;
        int end = arr.length() - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr.get(mid) > arr.get(mid+1)){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    int orderAgnosticBS(MountainArray arr, int target, int start, int end){
        boolean isAsc = arr.get(start) < arr.get(end);

        while(start <= end){
            int mid = start + (end - start) / 2;

            int midValue = arr.get(mid);

            if(midValue == target){
                return mid;
            }

            if(isAsc){
                if(target < midValue) {
					end = mid - 1;
				}else{
					start = mid + 1;
				}
			}else {
				if(target > midValue) {
					end = mid - 1;
				}else{
					start = mid + 1;
				}
			}
        }
        return -1;
    }
}