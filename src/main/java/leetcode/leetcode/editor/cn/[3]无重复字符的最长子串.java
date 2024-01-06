package leetcode.leetcode.editor.cn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 无重复字符的最长子串
 * 2023-12-01 09:28:34
 */
class LongestSubstringWithoutRepeatingCharacters {
	public static void main(String[] args) {
		Solution solution = new LongestSubstringWithoutRepeatingCharacters().new Solution();
		String string = "abba";
		int length = solution.lengthOfLongestSubstring(string);
		System.out.println(length);
	}

	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution {
		public int lengthOfLongestSubstring(String s) {
			int result = 0;
			int left = 0;
			HashMap<Character, Integer> windows = new HashMap<Character, Integer>();
			int length = s.length();
			for (int i = 0; i < length; i++) {
				if (windows.containsKey(s.charAt(i))) {
					/**
					 * 如果碰到重复的，就获取重复字段的位置，同时和left字段做对比（当前左边窗口的位置），两者取大。
					 * 因为可能会出现多个重复的字段，需要保持left数据的准确性，
					 * 比如“abba”，循环到第二个a的时候left=2,但是a的下标还是0，这个时候需要保持left不变
					 */
					left = Math.max(left, windows.get(s.charAt(i)) + 1);

					/** 不能left=i,left应该是重复的字符的坐标，而不是循环的坐标 */
					//left = i;
				}
				windows.put(s.charAt(i), i);
				result = Math.max(result, i - left + 1);
			}

			return result;
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
/*
 	public int lengthOfLongestSubstring(String s) {
			Set<Character> windows = new HashSet<Character>();
			// 时间右窗口
			int right = -1;
			//结果
			int result = 0;
			//字符串长度
			int length = s.length();
			//字符串的每一个字母都要循环到
			for (int i = 0; i < length; i++) {
				if (i != 0) {
					// 如果不是第一次运行，就会将左窗口先删除掉，开启下一轮循环
					windows.remove(s.charAt(i - 1));
				}
				// 如果之前右窗口的元素，不包含在里面，则加在窗口中，同时右窗口加1.
				// 注意：如果之前的有窗口不重复，是可以从上一次循环的窗口跑的
				// 每一次从左边开始循环，然后右边一直往前走，不用循环，不重复的就往里面加。
				//因为窗口中的数据肯定不重复的，那么之前左窗口数据已经判断了，就只需要循环左边就可以了。
				while (right + 1 < length && !windows.contains(s.charAt(right + 1))) {
					windows.add(s.charAt(right + 1));
					right++;
				}

				// 取最大的长度
				result = Math.max(result, right - i + 1);
			}
			return result;
		}
 */


