import easy.No14LongestCommonPrefix;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class No14LongestCommonPrefixTest {
    private void assertAnswer(String[] strs, String answer){
        No14LongestCommonPrefix no14LongestCommonPrefix = new No14LongestCommonPrefix();
        assert no14LongestCommonPrefix.longestCommonPrefix(strs).equals(answer);
    }

    @Test
    public void test(){
        assertAnswer(new String[]{"flower","flow","flight"},"fl");
        assertAnswer(new String[]{"dog","racecar","car"},"");
        assertAnswer(new String[]{},"");
        assertAnswer(new String[]{"aca","cba"},"");
    }
}
