class Solution {
    static void reverse(int nums[], int i, int j){
        while(i <= j){
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;

            i++;j--;
        }
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length, idx=-1;
        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1] ){
                idx = i;
                break;
            }
        }

        if(idx == -1){
            reverse(nums, 0, n-1);
            return;
        }

        for(int i=n-1; i>=0; i--){
            if(nums[i] > nums[idx]){
                int t = nums[i];
                nums[i] = nums[idx];
                nums[idx] = t;
                break;
            }
        }
        reverse(nums, idx+1, n-1);
    }
}