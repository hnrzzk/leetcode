import easy.No27RemoveElement;
import org.junit.jupiter.api.Test;

public class No27RemoveElementTest {
    private void assertAnswer(int[] value, int remove, int answer){
        No27RemoveElement solution = new No27RemoveElement();
        try {
            assert solution.removeElement(value, remove) == answer;
        }catch (Error e){
            System.out.println(String.format("result=%s exp=%s", solution.removeElement(value, remove), answer));
            throw e;
        }

}

    @Test
    public void test() {
        assertAnswer(new int[]{1,1,2}, 2, 2);
        assertAnswer(new int[]{0,0,1,1,1,2,2,3,3,4}, 0, 8);
        assertAnswer(new int[]{}, 0, 0);
        assertAnswer(new int[]{1,1}, 1, 0);
    }
}
