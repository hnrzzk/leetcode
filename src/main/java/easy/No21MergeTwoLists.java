package easy;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 示例：
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class No21MergeTwoLists {

    public No21MergeTwoListNode mergeTwoLists(No21MergeTwoListNode l1, No21MergeTwoListNode l2) {
        No21MergeTwoListNode temp = null;
        No21MergeTwoListNode head = null;
        while (l1 != null && l2!= null){
            No21MergeTwoListNode minNode;
            if (l1.val < l2.val){
                minNode = l1;
                l1 = l1.next;
            }else{
                minNode = l2;
                l2 = l2.next;
            }
            temp = addListNode(temp, minNode);
            if (null == head){
                head = temp;
            }
        }

        No21MergeTwoListNode notNull = (l1 != null ? l1 : l2);
        while (notNull != null){
            temp = addListNode(temp, notNull);
            if (null == head){
                head = temp;
            }
            notNull = notNull.next;
        }

        return head;
    }

    private No21MergeTwoListNode addListNode(No21MergeTwoListNode temp, No21MergeTwoListNode minNode) {
        if (null == temp) {
            temp = minNode;
        } else {
            temp.next = minNode;
            temp = temp.next;
        }
        return temp;
    }
}
