27.Median of Two Sorted Arrays

SOLUTION:-

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums2.length + nums1.length];
        int count1 = 0, count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE;
            a = count1 < nums1.length ? nums1[count1] : a;
            b = count2 < nums2.length ? nums2[count2] : b;
            if (a <= b) {
                arr[i] = a;
                count1++;
            } else {
                arr[i] = b;
                count2++;
            }
        }
        if (arr.length % 2 == 0) {
            return ((arr[(arr.length - 1)/2] + arr[arr.length/2]) * 1.0) / 2;
        } else {
            return arr[arr.length / 2];
        }
        
    }
}