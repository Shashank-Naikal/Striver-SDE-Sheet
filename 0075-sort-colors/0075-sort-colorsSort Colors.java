class Solution {

    public static void swap(int i,int j, int a[]){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0, mid = 0, high = n-1;
        
        while(mid <= high){
            if(nums[mid] == 0){
                swap(mid,low, nums);
                low++;
                mid++;
            }
            else if(nums[mid] == 2){
                swap(mid , high, nums);
                high--;
            }
            else{
                mid++;
            }
        }
    }
}
