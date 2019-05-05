import easy.No21MergeTwoListNode;
import easy.No21MergeTwoLists;
import org.junit.jupiter.api.Test;

public class No21MergeTwoListsTest {
    private void assertAnswer(No21MergeTwoListNode l1, No21MergeTwoListNode l2, No21MergeTwoListNode answer){
        No21MergeTwoLists solution = new No21MergeTwoLists();
        assert toString(solution.mergeTwoLists(l1, l2)).equals(toString(answer));
    }

    @Test
    public void test() {
        assertAnswer(createListNode(new int[]{1}),createListNode(new int[]{1}), createListNode(new int[]{1,1}));
        assertAnswer(createListNode(new int[]{1,2,3}),createListNode(new int[]{2,3,4}), createListNode(new int[]{1,2,2,3,3,4}));
        assertAnswer(createListNode(new int[]{}),createListNode(new int[]{1,2,3}), createListNode(new int[]{1,2,3}));
        assertAnswer(createListNode(new int[]{1,2}),createListNode(new int[]{}), createListNode(new int[]{1,2}));
    }

    private String toString(No21MergeTwoListNode node){
        StringBuilder stringBuilder = new StringBuilder();
        while (node != null){
            stringBuilder.append(node.val).append(" -> ");
            node = node.next;
        }
        return stringBuilder.toString();
    }

    private No21MergeTwoListNode createListNode(int[] arrays){
        No21MergeTwoListNode result = null;
        No21MergeTwoListNode head = null;
        for ( int i : arrays){
            if (result == null){
                result = new No21MergeTwoListNode(i);
                head = result;
            }else{
                result.next = new No21MergeTwoListNode(i);
                result = result.next;
            }
        }
        return head;
    }
}
