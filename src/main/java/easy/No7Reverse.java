package easy;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 * 输入: 123
 * 输出: 321
 *
 *  示例 2:
 * 输入: -123
 * 输出: -321
 *
 * 示例 3:
 * 输入: 120
 * 输出: 21
 *
 * 注意:
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 */
public class No7Reverse {
    public int reverse(int x) {
        int absX = Math.abs(x);
        boolean negative = (x != absX);
        long result = 0;
        while ( absX > 0){
            result *= 10;
            result += absX % 10;
            absX /= 10;
        }
        if (negative){
            result *= -1;
        }
        return result > Integer.MAX_VALUE || result < Integer.MIN_VALUE ? 0 : (int)result;
    }
}
