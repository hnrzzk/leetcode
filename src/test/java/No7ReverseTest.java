import easy.No7Reverse;
import org.junit.jupiter.api.Test;

public class No7ReverseTest {
    @Test
    public void test(){
//        assertAnswer(123, 321);
        assertAnswer(-123, -321);
        assertAnswer(0, 0);
        assertAnswer(1, 1);
        assertAnswer(-1, -1);
    }

    private void assertAnswer(int in, int out){
        No7Reverse answerObject = new No7Reverse();
        int answer = answerObject.reverse(in);
        assert out == answer;
    }
}
