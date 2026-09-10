class NumArray {
    int[] prefixArr;
    public NumArray(int[] nums) {
        prefixArr = nums;
        for(int i=1;i<prefixArr.length;i++){
            prefixArr[i] += prefixArr[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0)
            return prefixArr[right];
        return prefixArr[right] - prefixArr[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */