class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int sizeNum1 = nums1.length;
        int sizeNum2 = nums2.length;

        int i = 0;
        int j = 0;

        while (i < sizeNum1 && j < sizeNum2) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return -1;
    }

}