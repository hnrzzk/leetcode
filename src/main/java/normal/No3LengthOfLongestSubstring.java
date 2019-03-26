package normal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class No3LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> substringTemp = new HashMap<>();
        int substringNum = 0;
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            Integer sameNumInSubstringTemp = substringTemp.get(c);
            if (sameNumInSubstringTemp != null){
                substringTemp.clear();
                maxLength = Math.max(maxLength, substringNum);
                substringNum = 0;
                i = sameNumInSubstringTemp ;
            }else{
                substringTemp.put(c, i);
                substringNum++;
            }
        }
        maxLength = maxLength < substringNum? substringNum: maxLength;
        return maxLength;
    }

    public int best(String s){
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        No3LengthOfLongestSubstring test = new No3LengthOfLongestSubstring();
        System.out.println(test.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(test.lengthOfLongestSubstring("pwwkew"));
        System.out.println(test.lengthOfLongestSubstring("a"));
    }
}
