import easy.No13RomanToInt;
import org.junit.jupiter.api.Test;

public class No13RomanToIntTest {
    private void assertAnswer(String s, int value){
        No13RomanToInt obj = new No13RomanToInt();
        assert value == obj.romanToInt(s);
    }

    @Test
    public void test(){
        assertAnswer("III", 3);
        assertAnswer("IV", 4);
        assertAnswer("IX", 9);
        assertAnswer("LVIII", 58);
        assertAnswer("MCMXCIV", 1994);
    }
}
