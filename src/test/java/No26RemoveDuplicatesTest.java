import easy.No20IsValid;
import easy.No26RemoveDuplicates;
import org.junit.jupiter.api.Test;

public class No26RemoveDuplicatesTest {
    private void assertAnswer(int[] value, int answer){
        No26RemoveDuplicates solution = new No26RemoveDuplicates();
        assert solution.battleSolution(value) == answer;
    }

    @Test
    public void test() {
        assertAnswer(new int[]{1,1,2}, 2);
        assertAnswer(new int[]{0,0,1,1,1,2,2,3,3,4}, 5);
        assertAnswer(new int[]{}, 0);
        assertAnswer(new int[]{1,1}, 1);
    }
}
