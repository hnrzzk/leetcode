package easy;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * 示例 1:
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * 所有输入只包含小写字母 a-z 。
 */
public class No14LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean charSame = strs.length > 0;
        int i = 0;
        while(charSame){
            Character c = null;
            for (String str : strs){
                if (i == str.length()){
                    charSame = false;
                    break;
                }
                char temp = str.charAt(i);
                if (c == null)
                {
                    c = temp;
                }else if (!c.equals(temp)){
                    charSame = false;
                }
            }
            if (charSame){
                stringBuilder.append(c);
            }
            i++;
        }
        return stringBuilder.toString();
    }
}
