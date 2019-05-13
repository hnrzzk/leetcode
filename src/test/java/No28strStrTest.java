import easy.No28strStr;
import org.junit.jupiter.api.Test;

public class No28strStrTest {
    private void assertAnswer(String haystack, String needle, int answer){
        No28strStr solution = new No28strStr();
        try {
            assert solution.strStr(haystack, needle) == answer;
        }catch (Error e){
            System.out.println(String.format("result=%s exp=%s", solution.strStr(haystack, needle), answer));
            throw e;
        }

    }

    @Test
    public void test() {
        assertAnswer("hello", "ll", 2);
        assertAnswer("aaaaa", "bba", -1);
        assertAnswer("a", "", 0);
        assertAnswer("aaaa", "aa", 0);
        assertAnswer("a", "a", 0);
    }
}
