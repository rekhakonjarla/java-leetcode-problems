37. Remove Element

solution:-

class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0, edge = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                while (edge > 0) {
                    if (nums[edge] != val) {
                        nums[i] = nums[edge];
                        edge--;
                        break;
                    }
                    edge--;
                }
                count++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums.length - count;
    }
}