class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = 0;
        while(left<=right) {
            mid = (left+right)/2;
            if(nums[mid] > target) {
                right = mid - 1;
            }else if(nums[mid] < target) {
                left = mid + 1;
            }else if(nums[mid] == target) {
                return mid;
            }
        }
        System.out.println(mid);
        //return 에 걸리지 않아 해당 코드가 실행될 경우 값을 찾지 못했다는 것 
        if(nums[mid] < target) {
            return mid+1;
        }else {
            return mid;
        }
    }
}