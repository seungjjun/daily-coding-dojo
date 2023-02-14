public class MiddleNode {
    public ListNode middleNode(ListNode head) {

        ListNode[] listNodes = new ListNode[100];
        ListNode node = head;

        int index = 0;

        while (node != null) {
            listNodes[index] = node;
            node = node.next;
            index += 1;
        }

        return listNodes[index / 2];
    }
}
