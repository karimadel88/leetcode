import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        Set<Integer> set = new HashSet<>();

        int i = 0, j = 0;

        int n = nums1.length, m = nums2.length;

        while (i < n && j < m) {
            if (nums1[i] == nums2[j]) {
                set.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] ans = new int[set.size()];

        int k = 0;
        for (int item : set) {
            ans[k++] = item;
        }
        
        return ans;
    }
}
