import easy.No35SearchInsert;
import org.junit.jupiter.api.Test;

public class No35SearchInsertTest {
    private void assertAnswer(int[] data, int value, int answer){
        No35SearchInsert solution = new No35SearchInsert();
        try {
            assert solution.searchInsert(data, value) == answer;
        }catch (Error e){
            System.out.println(String.format("result=%s exp=%s", solution.searchInsert(data, value), answer));
            throw e;
        }

    }

    @Test
    public void test() {
        assertAnswer(new int[]{1,3,5,6}, 5, 2);
        assertAnswer(new int[]{1,3,5,6}, 2, 1);
        assertAnswer(new int[]{1,3,5,6}, 7, 4);
        assertAnswer(new int[]{1,3,5,6}, 0, 0);
        assertAnswer(new int[]{}, 1, 0);
        assertAnswer(new int[]{1}, 2, 1);
        assertAnswer(new int[]{2}, 1, 0);
        assertAnswer(new int[]{1,3}, 2, 1);
    }
}
