class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m];
        for (int i = 0; i < m; i++) {
            temp[i] = nums1[i];
        }

        int i = 0, j = 0;
        while (i < m && j < n) {
            if (temp[i] < nums2[j]) {
                nums1[i + j] = temp[i];
                i++;
            } else {
                nums1[i + j] = nums2[j];
                j++;
            }
        }
        while (i < m) {
            nums1[i + j] = temp[i];
            i++;
        }
        while (j < n) {
            nums1[i + j] = nums2[j];
            j++;
        }
    }
}