package leetcode.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 * 2023-11-27 21:44:32
 */
class TwoSum {
    public static void main(String[] args) {
        Solution solution = new TwoSum().new Solution();
        int[] nums = new int[]{2,7,11,15,16};
        int target = 9;
        int[] ints = solution.twoSum(nums, target);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


    //for (int i = 0; i < length; i++) {
    //    if (hashMap.containsKey(nums[i])) {
    //        return new int[]{hashMap.get(nums[i]),i};
    //    }
    //    hashMap.put(target - nums[i], i);
    //}
    /**
     * 耗时最少
     * class Solution {
     *     public int[] twoSum(int[] nums, int target) {
     *         int length = nums.length;
     *         for (int i = 1; i < length; i++) {
     *             for (int j = i; j < length; j++) {
     *                 //每次间隔+1，循环取数。所用的次数最少
     *                 if (nums[j-i] + nums[j]  == target){
     *                     return new int[]{j-i,j};
     *                 }
     *             }
     *         }
     *         return null;
     *     }
     */


    /**
     * class Solution {
     *     public int[] twoSum(int[] nums, int target) {
     *         int length = nums.length;
     *         for (int i = 0; i < nums.length; i++) {
     *             int find = target - nums[i];
     *             for (int j = i+1; j < length; j++) {
     *                 if (find == nums[j]){
     *                     int[] results = new int[2];
     *                     results[0] = i;
     *                     results[1] = j;
     *                     return results;
     *                 }
     *             }
     *         }
     *         return null;
     *     }
     * }
     */
}