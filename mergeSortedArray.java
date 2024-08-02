import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int pMerge = m + n - 1;

        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[pMerge--] = nums1[p1--];
            } else {
                nums1[pMerge--] = nums2[p2--];
            }
        }
    }
}

public class mergeSortedArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt(); 
        int nums1[] = new int[m + n];
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }
        int nums2[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }
        Solution solution = new Solution();
        solution.merge(nums1, m, nums2, n); 
        for (int i = 0; i < m + n; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
}
