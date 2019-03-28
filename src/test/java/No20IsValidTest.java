import easy.No20IsValid;
import org.junit.jupiter.api.Test;

public class No20IsValidTest {
    private void assertAnswer(String value, boolean answer){
        No20IsValid solution = new No20IsValid();
        assert solution.isValid(value) == answer;
    }

    @Test
    public void test(){
        assertAnswer("()", true);
        assertAnswer("()[]{}", true);
        assertAnswer("(]", false);
        assertAnswer("([)]", false);
        assertAnswer("{[]}", true);
        assertAnswer("", true);
        assertAnswer("]", true);
    }
}
