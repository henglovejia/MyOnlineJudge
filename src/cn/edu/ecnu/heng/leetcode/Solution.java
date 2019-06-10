package cn.edu.ecnu.heng.leetcode;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				return new int[] { map.get(target - nums[i]), i };
			}
			map.put(nums[i], i);
		}
		return new int[] { 0, 0 };
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		ListNode root = null, foot = null;
		for (; l1 != null || l2 != null; l1 = l1 == null ? null : l1.next, l2 = l2 == null ? null : l2.next) {
			int tmp = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
			if (root == null) {
				root = new ListNode(tmp % 10);
				foot = root;
			} else {
				foot.next = new ListNode(tmp % 10);
				foot = foot.next;
			}
			carry = tmp / 10;
		}
		if (carry == 1) {
			foot.next = new ListNode(1);
		}
		return root;
	}

	public int lengthOfLongestSubstring(String s) {
		HashMap<Character, String> map = new HashMap<Character, String>();
		int start = 0;
		int max = 0;
		for (int end = 0; end < s.length(); end++) {
			if (map.containsKey(s.charAt(end))) {
				max = map.size() > max ? map.size() : max;
				for (; start < end && map.containsKey(s.charAt(end)); start++) {
					map.remove(s.charAt(start));
				}
				map.put(s.charAt(end), null);
			} else {
				map.put(s.charAt(end), null);
				max = map.size() > max ? map.size() : max;
			}
		}
		return max;
	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int middle1 = nums1.length / 2, middle2 = nums2.length / 2;

		if ((nums1.length + nums2.length) % 2 == 0) {
			return (double) (nums1[middle1] + nums2[middle2]) / 2;
		}
		return (double) nums1[middle1] > nums2[middle2] ? nums1[middle1] : nums2[middle2];
	}

	public String convert(String s, int numRows) {
		if (numRows == 1)
			return s;

		StringBuilder ret = new StringBuilder();
		int n = s.length();
		int cycleLen = 2 * numRows - 2;

		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j + i < n; j += cycleLen) {
				ret.append(s.charAt(j + i));
				if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
					ret.append(s.charAt(j + cycleLen - i));
			}
		}
		return ret.toString();
	}

	public int reverse(int x) {
		boolean isNeg = x > 0 ? false : true;
		String tmp = (isNeg ? -x : x) + "";
		StringBuffer sBuffer = new StringBuffer();
		for (int i = tmp.length() - 1; i > -1; i--) {
			if (tmp.charAt(i) != '-') {
				sBuffer.append(tmp.charAt(i));
			}
		}
		long tmpLong = Long.parseLong(sBuffer.toString());
		return isNeg ? (-tmpLong < Integer.MIN_VALUE ? 0 : -(int) tmpLong)
				: (tmpLong > Integer.MAX_VALUE ? 0 : (int) tmpLong);
	}

	public int myAtoi(String str) {
		Boolean isNeg = null;
		long sum = 0;
		for (char i : str.toCharArray()) {
			if (i <= '9' && i >= '0') {
				isNeg = isNeg == null ? false : isNeg;
				sum *= 10;
				if (isNeg) {
					if (-sum < Integer.MIN_VALUE) {
						return Integer.MIN_VALUE;
					}
				} else {
					if (sum > Integer.MAX_VALUE) {
						return Integer.MAX_VALUE;
					}
				}
				sum += Integer.parseInt(i + "");
			} else if (i == '-' && isNeg == null) {
				isNeg = true;
			} else if (i == '+' && isNeg == null) {
				isNeg = false;
			} else {
				if (i != ' ') {
					if (isNeg == null) {
						return 0;
					} else {
						return (isNeg == null) ? 0 : (isNeg ? -(int) sum : (int) sum);
					}
				}

			}
		}
		return (isNeg == null) ? 0 : (isNeg ? -(int) sum : (int) sum);
	}

	public boolean isPalindrome(int x) {
		if (x < 0 || (x % 10 == 0 && x != 0)) {
			return false;
		}
		int revertedNumber = 0;
		while (x > revertedNumber) {
			revertedNumber = revertedNumber * 10 + x % 10;
			x /= 10;
		}
		return x == revertedNumber || x == revertedNumber / 10;
	}

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Set<String> set = new HashSet<String>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (map.containsKey(0 - nums[i] - nums[j])) {
					if (map.get(0 - nums[i] - nums[j]) > j) {
						List<Integer> item = new ArrayList<Integer>();
						item.add(nums[i]);
						item.add(nums[j]);
						item.add(0 - nums[i] - nums[j]);
						if (!set.contains(nums[i] + "" + nums[j])) {
							list.add(item);
							set.add(nums[i] + "" + nums[j]);
						}
					}
				}
			}
		}
		return list;
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode node = new ListNode(0), foot = head;
		node.next = head;
		for (int i = 0; i < n; i++) {
			foot = foot.next;
		}
		do {
			if (foot == null) {
				return head.next;
			}
			foot = foot.next;
			node = node.next;
		} while (foot != null);
		node.next = node.next.next;
		return head;
	}

	public boolean isValid(String s) {
		Stack<String> stack = new Stack<String>();
		Map<String, String> map = new HashMap<String, String>(4);
		map.put("#", "#");
		map.put("(", ")");
		map.put("[", "]");
		map.put("{", "}");
		stack.push("#");
		for (char item : s.toCharArray()) {
			if (item == '(' || item == '{' || item == '[') {
				stack.push(item + "");
				continue;
			}
			if (item == ')' || item == '}' || item == ']') {
				if (!map.get(stack.pop()).equals(item + "")) {
					return false;
				}
			}
		}
		if (stack.size() == 1) {
			return true;
		}
		return false;
	}

	public int removeDuplicates(int[] nums) {
		int start = 0, end = 1;
		for (; end < nums.length; end++) {
			if (nums[start] != nums[end]) {
				nums[++start] = nums[end];
			}
		}
		return start + 1;
	}

	public Boolean isChinese(String str) {
		String regEx = "[\u4e00-\u9fa5]";
		int count = 0;
		Pattern pat = Pattern.compile(regEx);
		Matcher matcher = pat.matcher(str);
		while (matcher.find()) {
			for (int i = 0; i <= matcher.groupCount(); i++) {
				count = count + 1;
			}
		}
		return count == str.length();
	}

	public int removeElement(int[] nums, int val) {
		int start = 0, end = 0;
		for (; end < nums.length; end++) {
			if (nums[end] != val) {
				nums[start++] = nums[end];
			}
		}
		return start;
	}

	public int strStr(String haystack, String needle) {
		if (needle == null) {
			return 0;
		}
		return haystack.indexOf(needle);
	}

	public int divide(int dividend, int divisor) {
		long tmp = dividend / divisor;
		return (int) ((tmp > Integer.MAX_VALUE || tmp < Integer.MIN_VALUE) ? Integer.MAX_VALUE : tmp);
	}

	public int fixNum(int n) {
		int tmp = n * n;
		int num = 0;
		for (int i = 1; i <= n; i++) {
			if (tmp % i == 0) {
				num++;
			}
		}
		return num;
	}

	public int findN(int find) {
		for (int i = 1;; i++) {
			int tmp = fixNum(i);
			if (tmp == find) {
				return i;
			}
			if (tmp > find) {
				return -1;
			}
		}
	}

	public int countDllFile(String filePath) {
		int count = 0;
		File file = new File(filePath);
		if (file.exists()) {
			File[] listFiles = file.listFiles();
			if (listFiles != null) {
				for (File file2 : listFiles) {
					if (file2.isDirectory()) {
						count += countDllFile(file2.getAbsolutePath());
					} else if (file2.getAbsolutePath().endsWith(".dll")) {
						System.out.println(file2.getAbsolutePath());
						++count;
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		System.out.println(solution.countDllFile("C:\\"));
	}

}
