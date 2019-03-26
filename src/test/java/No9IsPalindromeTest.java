import easy.No9IsPalindrome;
import org.junit.jupiter.api.Test;

public class No9IsPalindromeTest {

    private void assertAnswer(int x, boolean answer){
        No9IsPalindrome obj = new No9IsPalindrome();
        assert obj.isPalindrome(x) == answer;
    }

    @Test
    public void test(){
        assertAnswer(121, true);
        assertAnswer(1, true);
        assertAnswer(10, false);
        assertAnswer(0, true);
        assertAnswer(-121, false);
    }
}
