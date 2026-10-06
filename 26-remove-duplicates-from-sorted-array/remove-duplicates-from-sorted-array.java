class Solution {
    public int removeDuplicates(int[] nums) {

        // If array has only one element
        if (nums.length == 1) {
            return 1;
        }

        // i points to the last unique element
        int i = 0;

        // j scans the array
        for (int j = 1; j < nums.length; j++) {

            // Found a new unique element
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        // Number of unique elements
        return i + 1;
    }
}